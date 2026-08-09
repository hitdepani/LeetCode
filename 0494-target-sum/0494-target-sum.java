class Solution {
    int sol(int nums[],int target,int i,int sum,int dp[][])
    {
        
        if(sum==target && i==-1)
        return 1;
        if(i<0)
        return 0 ;
        if(dp[i][sum+1000]!=0)
        return dp[i][sum+1000];
        return dp[i][sum+1000]=sol(nums,target,i-1,sum-nums[i],dp)+sol(nums,target,i-1,sum+nums[i],dp);
        
        
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int dp[][]= new int[n][3000];
        return sol(nums,target,n-1,0,dp);
    }
}