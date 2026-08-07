import java.util.Arrays;

class Solution {
    public boolean check(long t) {
        while (t > 0 && t % 2 == 0) t /= 2;
        while (t > 0 && t % 3 == 0) t /= 3;
        while (t > 0 && t % 5 == 0) t /= 5;
        while (t > 0 && t % 7 == 0) t /= 7;
        return t <= 1;
    }

    public int[] fac(long n) {
        int[] arr = new int[4];
        while (n > 0 && n % 2 == 0) { n /= 2; arr[0]++; }
        while (n > 0 && n % 3 == 0) { n /= 3; arr[1]++; }
        while (n > 0 && n % 5 == 0) { n /= 5; arr[2]++; }
        while (n > 0 && n % 7 == 0) { n /= 7; arr[3]++; }
        return arr;
    }

    public int getMin(int a, int b, int c, int d) {
        int base = c + d;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= a / 3; i++) {
            for (int j = 0; j <= b / 2; j++) {
                int max = Math.min(a - (i * 3), b - (j * 2));
                for (int k = 0; k <= max; k++) {
                    int r2 = a - (i * 3) - k;
                    int r3 = b - (j * 2) - k;
                    int len = i + j + k + (r2 / 2) + (r2 % 2) + r3;
                    if (len < min) min = len;
                }
            }
        }
        return base + min;
    }

    public String build(int a, int b, int c, int d, int spaces) {
        int min = Integer.MAX_VALUE;
        String bestSuf = "";
        
        for (int i = 0; i <= a / 3; i++) {
            for (int j = 0; j <= b / 2; j++) {
                int max = Math.min(a - (i * 3), b - (j * 2));
                for (int k = 0; k <= max; k++) {
                    int r2 = a - (i * 3) - k;
                    int r3 = b - (j * 2) - k;
                    int len = i + j + k + (r2 / 2) + (r2 % 2) + r3;
                    
                    if (len <= min) {
                        StringBuilder sb = new StringBuilder();
                        for (int x = 0; x < i; x++) sb.append('8');
                        for (int x = 0; x < j; x++) sb.append('9');
                        for (int x = 0; x < k; x++) sb.append('6');
                        for (int x = 0; x < r2 / 2; x++) sb.append('4');
                        for (int x = 0; x < r3; x++) sb.append('3');
                        for (int x = 0; x < r2 % 2; x++) sb.append('2');
                        
                        char[] arr = sb.toString().toCharArray();
                        Arrays.sort(arr);
                        String s = new String(arr);
                        
                        if (len < min || s.compareTo(bestSuf) < 0) {
                            min = len;
                            bestSuf = s;
                        }
                    }
                }
            }
        }
        
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < c; i++) res.append('5');
        for (int i = 0; i < d; i++) res.append('7');
        res.append(bestSuf);
        
        while (res.length() < spaces) res.append('1');
        
        char[] finalArr = res.toString().toCharArray();
        Arrays.sort(finalArr);
        return new String(finalArr);
    }

    public String smallestNumber(String num, long t) {
        if (!check(t)) return "-1";

        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                for (int j = i; j < chars.length; j++) chars[j] = '1';
                break;
            }
        }
        num = new String(chars);

        int[] req = fac(t);
        int len = num.length();
        int[][] p = new int[len + 1][4];

        for (int i = 0; i < len; i++) {
            int val = num.charAt(i) - '0';
            int[] temp = fac(val);
            for (int j = 0; j < 4; j++) {
                p[i + 1][j] = p[i][j] + temp[j];
            }
        }

        if (p[len][0] >= req[0] && p[len][1] >= req[1] &&
            p[len][2] >= req[2] && p[len][3] >= req[3]) {
            return num;
        }

        for (int i = len - 1; i >= 0; i--) {
            int cur = num.charAt(i) - '0';
            int space = len - 1 - i;

            for (int k = cur + 1; k <= 9; k++) {
                int[] temp = fac(k);
                int n1 = Math.max(0, req[0] - (p[i][0] + temp[0]));
                int n2 = Math.max(0, req[1] - (p[i][1] + temp[1]));
                int n3 = Math.max(0, req[2] - (p[i][2] + temp[2]));
                int n4 = Math.max(0, req[3] - (p[i][3] + temp[3]));

                if (getMin(n1, n2, n3, n4) <= space) {
                    String suf = build(n1, n2, n3, n4, space);
                    return num.substring(0, i) + k + suf;
                }
            }
        }

        return build(req[0], req[1], req[2], req[3], len + 1);
    }
}