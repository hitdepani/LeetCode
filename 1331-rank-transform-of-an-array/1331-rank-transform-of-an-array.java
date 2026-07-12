import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }
        int[] brr = arr.clone();
        Arrays.sort(brr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        
        for (int i = 0; i < brr.length; i++) {
            if (!map.containsKey(brr[i])) {
                map.put(brr[i], rank);
                rank++;
            }
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(arr[i]);
        }

        return res;
    }
}