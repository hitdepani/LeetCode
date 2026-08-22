class Solution {
    public int maxProfit(int m,int[] prices) {
        int n=prices.length;
        int dp[][][]= new int[n+1][2][m+1];
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=m-1;k>=0;k--)
                {
                    int profit=0;
                    if(j==1)
                    {
                        profit = Math.max(-prices[i] + dp[i + 1][0][k],dp[i + 1][1][k]);
                    }
                    else
                    {
                        profit = Math.max(prices[i] + dp[i + 1][1][k+1],dp[i + 1][0][k]);
                    }
                    
                    dp[i][j][k]=profit;
                }
            }
        }
        return dp[0][1][0];
    }
}