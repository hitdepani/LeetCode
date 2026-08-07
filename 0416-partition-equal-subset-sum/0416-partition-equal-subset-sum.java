class Solution {
    boolean sol(int nums[],int i,int sum,int temp,Boolean dp[][])
    {
        if((sum/2)==temp)
        return true;
        
        
        if(i<0||temp>sum/2)
        return false;
        if(dp[i][temp]!=null)
        return dp[i][temp];
        boolean take=sol(nums,i-1,sum,temp+nums[i],dp);
        boolean notake=sol(nums,i-1,sum,temp,dp);
        return dp[i][temp]=take||notake;
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        if(sum%2==1) return false;
        Boolean dp[][]= new Boolean [n][sum+1];
        return sol(nums,n-1,sum,0,dp);
        
    }
}