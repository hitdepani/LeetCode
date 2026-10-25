class Solution {
    public boolean dfs(int grid[][],int i,int j)
    {
        if(i<0||j<0||i>=grid.length||j>=grid[0].length)
        return false;
        if(grid[i][j]==1)
        return true;
        grid[i][j]=1;
        boolean a=dfs(grid,i+1,j);
        boolean b=dfs(grid,i-1,j);
        boolean c=dfs(grid,i,j+1);
        boolean d=dfs(grid,i,j-1);
        
        return a&&b&&c&&d;
    }
    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int c=0;
        for(int i=1;i<=n-2;i++)
        {
            for(int j=1;j<=m-2;j++)
            {
                if(grid[i][j]==0&&dfs(grid,i,j))
                {
                    c++;
                }
            }
        }
        return c;
    }
}