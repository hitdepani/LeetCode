class Solution {
    public int minMoves(String[] classroom, int energy) {
        int n=classroom.length;
        int m=classroom[0].length();
        char arr[][]=new char[n][m];
        
        int id[][]=new int[n][m];
        int count=0;
        
        for(int i=0;i<n;i++) {
            arr[i]=classroom[i].toCharArray();
            for(int j=0;j<m;j++) {
                if(arr[i][j]=='L') {
                    id[i][j]=count++;
                } else {
                    id[i][j]=-1;
                }
            }
        }
        
        int vis[][][]=new int[n][m][1<<count];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                Arrays.fill(vis[i][j],-1);
            }
        }
        
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(arr[i][j]=='S') {
                    q.offer(new int[]{i,j,0,energy,0});
                    vis[i][j][0]=energy;
                }
            }
        }
        
        int goal=(1<<count)-1;
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        
        while(!q.isEmpty()) {
            int cur[]=q.poll();
            int r=cur[0];
            int c=cur[1];
            int mask=cur[2];
            int e=cur[3];
            int steps=cur[4];
            
            if(mask==goal) return steps;
            
            for(int d=0;d<4;d++) {
                int nr=r+dr[d];
                int nc=c+dc[d];
                
                if(nr>=0 && nr<n && nc>=0 && nc<m && arr[nr][nc]!='X') {
                    int ne=e-1;
                    if(ne<0) continue;
                    
                    int nmask=mask;
                    if(arr[nr][nc]=='L') nmask|=(1<<id[nr][nc]);
                    
                    int fe=(arr[nr][nc]=='R')?energy:ne;
                    
                    if(fe>vis[nr][nc][nmask]) {
                        vis[nr][nc][nmask]=fe;
                        q.offer(new int[]{nr,nc,nmask,fe,steps+1});
                    }
                }
            }
        }
        return -1;
    }
}