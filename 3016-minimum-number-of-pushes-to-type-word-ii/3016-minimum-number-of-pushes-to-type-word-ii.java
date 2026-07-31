class Solution {
    public int minimumPushes(String word) {
        int arr[]= new int[26];
        int n=word.length();
        for(int i=0;i<n;i++)
        {
            arr[word.charAt(i)-'a']++;
        }
        Arrays.sort(arr);
        int res=0;
        for(int i=25;i>=0;i--)
        {
            if(arr[i]!=0)
            {
                if(i>=18)
                res+=arr[i];
                else if(i>=10)
                res+=(arr[i]*2);
                else if(i>=2)
                res+=(arr[i]*3);
                else
                res+=(arr[i]*4);
            }
        }
        return res;

    }
}