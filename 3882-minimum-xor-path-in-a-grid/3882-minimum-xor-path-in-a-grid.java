class Solution {
    int min=Integer.MAX_VALUE;
    void dp(int grid[][],int i,int j,int x,int dpp[][][])
    {
        if(i==grid.length-1&&j==grid[0].length-1)
        {
            min=Math.min(min,x^grid[i][j]);
            dpp[i][j][x]=min;
            return;
        }
        if(i>=grid.length||j>=grid[0].length)
        {
            return ;
        }
        if(dpp[i][j][x]!=-1)return;
        dpp[i][j][x]=1;
        dp(grid,i+1,j,x^grid[i][j],dpp);
        dp(grid,i,j+1,x^grid[i][j],dpp);
        
    }
    public int minCost(int[][] grid) {
        int dpp[][][]= new int[grid.length+1][grid[0].length+1][1024];
        for(int row[][]:dpp)
        {
            for(int col[]:row)
            {
                Arrays.fill(col,-1);
            }
        }
        dp(grid,0,0,0,dpp);
        return min;
    }
}