class Solution {
    int sol(int n,int m,int dp[][],int obstacleGrid[][])
    {
        if(n<0||m<0)
        return 0;
        else if(obstacleGrid[n][m]==1)
        return 0;
        else if(n==0&&m==0)
        return 1;
        else if(dp[n][m]!=0)
        return dp[n][m];
         dp[n][m]=sol(n-1,m,dp,obstacleGrid)+sol(n,m-1,dp,obstacleGrid);
             return dp[n][m];
        

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
        int dp[][]= new int[n][m];
        return sol(n-1,m-1,dp,obstacleGrid);

    }
    
}