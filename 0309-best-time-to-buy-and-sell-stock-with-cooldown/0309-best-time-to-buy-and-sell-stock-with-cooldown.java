class Solution {
    int sol(int i,int prices[],int buy,int dp[][])
    {
        if(i>=prices.length)
        return 0;
        if(dp[i][buy]!=-1)
        return dp[i][buy];
        int profit=0;
        if(buy==1)
        {
            profit=Math.max(-prices[i]+sol(i+1,prices,0,dp),sol(i+1,prices,1,dp));
        }
        else
        {
            profit=Math.max(prices[i]+sol(i+2,prices,1,dp),sol(i+1,prices,0,dp));
        }
        return dp[i][buy]=profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][]= new int[n+1][2];
        for(int i=0;i<=n;i++)
        Arrays.fill(dp[i],-1);
        return sol(0,prices,1,dp);
    }
}