class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i:nums)
        sum+=i;
        if(sum%2!=0)return false;
        sum/=2;
        boolean dp[][]= new boolean[nums.length+1][sum+1];
        dp[n][0]=true;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=sum;j++)
            {
                boolean exclude=dp[i+1][j];
                boolean include=false;
                if(j>=nums[i])
                include=dp[i+1][j-nums[i]];
                dp[i][j]=include||exclude;
            }
            
        }
        return dp[0][sum];
    }
}