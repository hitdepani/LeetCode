class Solution {
    int help(int i,int coins[],int target,int dp[][])
    {
        if(target==0)
        {
            return 1;
        }
        
        if(target<0||i==coins.length)
        return 0;
        if(dp[i][target]!=-1)return dp[i][target];
       int pick=help(i,coins,target-coins[i],dp);
       int notpick=help(i+1,coins,target,dp);
       return dp[i][target]=pick+notpick;
        
    }
    public int change(int amount, int[] coins) {
       int dp[][]= new int[coins.length+1][amount+1];
        for(int i=0;i<=coins.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return help(0,coins,amount,dp);
    }
}