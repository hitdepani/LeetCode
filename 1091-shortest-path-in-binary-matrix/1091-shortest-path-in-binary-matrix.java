class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
       int visited[][]= new int[n][n];
        if(grid[0][0]==1)
        return -1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                visited[i][j]=-1;
                
            }
            
        }
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[] {0,0,1});
        visited[0][0]=1;
        int dx[]={1,-1,0,0,1,-1,-1,1};
        int dy[]={0,0,-1,1,1,-1,1,-1};
        while(!q.isEmpty())
        {
            int arr[]=q.poll();
            int a=arr[0];
            int b=arr[1];
            int c=arr[2];
            for(int i=0;i<8;i++)
            {
                int xx=a+dx[i];
                int yy=b+dy[i];
                if(xx<0 ||xx >=n ||yy<0 ||yy>=n ||visited[xx][yy]!=-1||grid[xx][yy]==1)
                {
                    continue;
                }
                q.add(new int[] {xx,yy,c+1});
                visited[xx][yy]=c+1;
            }
        }
        return visited[n-1][n-1];
    }
}