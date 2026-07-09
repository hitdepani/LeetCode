class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int dist[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dist[i][j]=10000000;
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.add(new int[] {0,0,0}); //effort , x,y
        int dx[]={0,0,1,-1};
        int dy[]={1,-1,0,0};
        dist[0][0]=0;
        int res=1000000;
        while(!pq.isEmpty())
        {
            int arr[]=pq.poll();
            int aa=arr[0];
            int bb=arr[1];
            int cc=arr[2];
            if(bb==n-1 && cc==m-1)
            {
                res=Math.min(res,aa);
            } 
            for(int dir=0;dir<4;dir++)
            {
                int xx=bb+dx[dir];
                int yy=cc+dy[dir];
                if(xx<0||xx>=n||yy<0||yy>=m)
                {
                    continue;
                }
                else if(Math.abs(heights[xx][yy]-heights[bb][cc]) < dist[xx][yy])
                {
                    pq.add(new int[] {Math.max(aa,Math.abs(heights[xx][yy]-heights[bb][cc])),xx,yy});
                    dist[xx][yy]=Math.abs(heights[xx][yy]-heights[bb][cc]);
                }
                
            }
        }
        return res;

    }
}

