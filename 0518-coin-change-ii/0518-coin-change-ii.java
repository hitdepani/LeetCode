class Solution {
    
    public int change(int amount, int[] coins) {
       int dp[][]= new int[coins.length+1][amount+1];
       int n=coins.length;
        for (int i = 0; i <= n; i++) 
        {
            dp[i][0] = 1;
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=1;j<=amount;j++)
            {
                int pick=0;
                if(j-coins[i]>=0)
                pick=dp[i][j-coins[i]];
                int notpick=dp[i+1][j];
                dp[i][j]=pick+notpick;
            }
        }
        return dp[0][amount];
    }
}