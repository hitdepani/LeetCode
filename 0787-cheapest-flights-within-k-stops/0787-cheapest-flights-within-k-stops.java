class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int []>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());

        }
        for(int arr[]:flights)
        {
            int a=arr[0];
            int b=arr[1];
            int c=arr[2];
            adj.get(a).add(new int[] {b,c}); // to city  -  price
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[0] - y[0]);
        int price[]= new int[n];
        for(int i=0;i<n;i++)
        {
            price[i]=(int)1e9;
        }
        pq.add(new int[] {0,src,0}); // distance - node  - k
        
        while(!pq.isEmpty())
        {
            int arr[]=pq.poll();
            int a=arr[0];//distance
            int b=arr[1];//node
            int c=arr[2];//curr k
            if(c>k+1)
            continue;
            if(b==dst )
            return a;
           if(price[b]<=c)
           continue;
           price[b]=c;
            for(int brr[]:adj.get(b))
            {
                int x=brr[0];
                int y=brr[1];
                
                    pq.add(new int[] {a+y,x,c+1});
                    
            }
        }
        return -1;
    }
}