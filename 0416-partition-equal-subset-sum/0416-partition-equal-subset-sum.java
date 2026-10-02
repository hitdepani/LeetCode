class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i:nums)
        sum+=i;
        if(sum%2!=0)return false;
        sum/=2;
        boolean dp[]= new boolean[sum+1];
        dp[0]=true;
        for(int i=nums.length-1;i>=0;i--)
        {
            for(int j=sum;j>=nums[i];j--)
            dp[j]=dp[j]||dp[j-nums[i]];
        }
        return dp[sum];
    }
}