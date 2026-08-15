class Solution {
    public int longestSubsequence(int[] nums) {
        int x=0;
        int n=nums.length;
        int co=0;
        for(int a:nums)
        {
            if(a==0)
            co++;
            x^=a;
        }
        if(co==n)
        return 0;
        else if(x==0)
        return n-1;
        
        else return n;

    }
}