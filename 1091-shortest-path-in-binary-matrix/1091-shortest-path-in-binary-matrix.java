class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1)
        return -1;
        
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[] {0,0});
        int dx[]={1,-1,0,0,1,-1,-1,1};
        int dy[]={0,0,-1,1,1,-1,1,-1};
        grid[0][0]=1;
        while(!q.isEmpty())
        {
            int arr[]=q.poll();
            int a=arr[0];
            int b=arr[1];
            if(a==n-1 && b==n-1)
            return grid[n-1][n-1];
            //int c=arr[2];
            for(int i=0;i<8;i++)
            {
                int xx=a+dx[i];
                int yy=b+dy[i];
                if(xx<0 ||xx >=n ||yy<0 ||yy>=n ||grid[xx][yy]==1)
                {
                    continue;
                }
                else if(grid[xx][yy]==0)
                {
                    q.add(new int[] {xx,yy});
                    grid[xx][yy]=grid[a][b]+1;

                }
                
            }
        }
        return -1;
    }
}