class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int arr[]=new int[26];
        int max=0;
        int j=0,i=0;
        while(i<n&&j<n)
        {
            arr[s.charAt(j)-'a']++;
            if(arr[s.charAt(j)-'a']>2)
            {
                while(i<n && s.charAt(i)!=s.charAt(j))
                {
                    arr[s.charAt(i)-'a']--;
                    i++;

                }
                arr[s.charAt(i)-'a']--;
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}