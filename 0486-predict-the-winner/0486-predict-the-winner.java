class Solution {
    int sol(int nums[],int i,int j,int dp[])
    {
        if(i==j)
        return nums[i];
        if(dp[i]!=-1)
        return dp[i];
        else if(dp[j]!=-1)
        return dp[j];
        int left=nums[i]-sol(nums,i+1,j,dp);
        int right=nums[j]-sol(nums,i,j-1,dp);
        return Math.max(left,right);
    }
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int dp[]= new int[n];
        Arrays.fill(dp,-1);
        int x=sol(nums,0,n-1,dp);
        if(x<0)
        return false;
        else return true;
    }
}