class Solution {
    int sol(int i,int prices[],boolean buy,int times,int dp[][][])
    {
        int x=0;
        if(buy)
        x=1;
        if(times>=2)
        return 0;
        if(i>=prices.length)
        return 0;
        if(dp[i][x][times]!=-1)
        return dp[i][x][times];
        int profit=0;
        if(buy)
        {
            profit = Math.max(-prices[i] + sol(i + 1, prices, false, times,dp),sol(i + 1, prices, true, times,dp));
        }
        else
        {
            profit = Math.max(prices[i] + sol(i + 1, prices, true, times + 1,dp),sol(i + 1, prices, false, times,dp));
        }
        
        return dp[i][x][times]=profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp[][][]= new int[n][2][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return sol(0,prices,true,0,dp);
    }
}