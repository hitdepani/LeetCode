class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int []>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int arr[]:times)
        {
            int a=arr[0];
            int b=arr[1];
            int c=arr[2];
            adj.get(a).add(new int[] {b,c}); // source - target - timie
        }
        int time[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            time[i]=Integer.MAX_VALUE;
        }
        time[k]=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[0] - y[0]);
        pq.add(new int[] {0,k});
        while(!pq.isEmpty())
        {
            int arr[]=pq.poll();
            int a=arr[0];
            int b=arr[1];
            for(int brr[]:adj.get(b))
            {
                int x=brr[0];
                int y=brr[1];
                if(time[x]>y+a)
                {
                    pq.add(new int[] {y+a,x});
                    time[x]=y+a;
                }

            }
        }
        int max=-1;
        for(int i=1;i<=n;i++)
        {
            if(i==k)continue;
            if(time[i]==Integer.MAX_VALUE) return -1;
            max=Math.max(max,time[i]);
        }
        return max;
       
    }
    
}