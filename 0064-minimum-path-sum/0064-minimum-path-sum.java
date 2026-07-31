class Solution {
    int sol(int n,int m,int dp[][],int grid[][])
    {
        if(n<0&&m<0)
        return 0;
        if(dp[n][m]!=0)
        return dp[n][m];
        if(n==0&&m==0)
        return grid[n][m];
        if(n==0)
        return dp[n][m]=grid[n][m]+sol(n,m-1,dp,grid);
        else if(m==0)
        return dp[n][m]=grid[n][m]+sol(n-1,m,dp,grid);
        
        dp[n][m]=grid[n][m]+Math.min(sol(n-1,m,dp,grid),sol(n,m-1,dp,grid));
        return dp[n][m];
    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]= new int[n][m];
        
        return sol(n-1,m-1,dp,grid);
    }
}