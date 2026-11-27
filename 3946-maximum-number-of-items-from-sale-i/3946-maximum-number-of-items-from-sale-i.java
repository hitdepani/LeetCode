class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        int dp[]= new int[budget+1];
        for(int i=0;i<n;i++)
        {
            int f=items[i][0];
            int pr=items[i][1];
            int v=1;
            for(int j=0;j<n;j++)
            {
                if(i!=j&&items[j][0]%f==0)
                {
                    v++;
                }
            }
            for(int b=budget;b>=pr;b--)
            {
                dp[b]=Math.max(dp[b],dp[b-pr]+v);
            }
        }
        for(int i=0;i<n;i++)
        {
            int p=items[i][1];
            for(int j=p;j<=budget;j++)
            {
                dp[j]=Math.max(dp[j],dp[j-p]+1);
            }
        }
        return dp[budget];
    }
}