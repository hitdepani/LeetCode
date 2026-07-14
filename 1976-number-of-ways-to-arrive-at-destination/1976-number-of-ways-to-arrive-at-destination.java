class Solution {
    public int countPaths(int n, int[][] roads) {
        int mod = (int)(1e9 + 7);
        ArrayList<ArrayList<int []>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int arr[]:roads)
        {
            int a=arr[0];
            int b=arr[1];
            int c=arr[2];
            adj.get(a).add(new int[] {b,c}); // source - target - dist
            adj.get(b).add(new int[] {a,c});
        }
        int way[]= new int[n];
        long dist[]=new long[n];
        for(int i=0;i<n;i++)
        {
            dist[i]=Long.MAX_VALUE;
        }
        
        PriorityQueue<long[]> pq = new PriorityQueue<>((x, y) -> Long.compare(x[0], y[0]));
        pq.add(new long[] {0,0});
        dist[0]=0;
        way[0]=1;
        while(!pq.isEmpty())
        {
            long arr[]=pq.poll();
            long a=arr[0];
            int b=(int)arr[1];
            
           
            for(int brr[]:adj.get(b))
            {
                int x=brr[0];
                int y=brr[1];
                if(dist[x]>y+a)
                {
                    pq.add(new long[] {y+a,x});
                    dist[x]=y+a;
                    way[x]=way[b];
                }
                else if(dist[x]==y+a)
                {
                    way[x]=(way[x]+way[b])%mod;
                }

            }
        }
        return way[n-1];
    }
}