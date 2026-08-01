class Solution {
    int sol(int n,int m,int dp[][],List<List<Integer>> triangle,int i,int j)
    {
        
        if(dp[i][j]!=Integer.MAX_VALUE)
        return dp[i][j];
        if(i==n&&j==m)
        return triangle.get(i).get(j);
        if(i<0||j<0)
        return 0;
        if(i>n||j>=m)
        return 0;
        return dp[i][j]=triangle.get(i).get(j)+Math.min(sol(n,m,dp,triangle,i+1,j),sol(n,m,dp,triangle,i+1,j+1));
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int m=triangle.get(n-1).size();
        int dp[][]= new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            dp[i][j]=Integer.MAX_VALUE;
        }
        for(int i=0;i<n;i++)
        dp[n-1][i]=triangle.get(n-1).get(i);
        for(int i=n-2;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                dp[i][j]=Math.min(triangle.get(i).get(j)+dp[i+1][j],triangle.get(i).get(j)+dp[i+1][j+1]);
            }
        }
        return dp[0][0];
    }
}