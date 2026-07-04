class Solution {
    public int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<int[]>> list=new ArrayList<>();
        for(int i=0;i<n+1;i++)
        {
            list.add(new ArrayList<>());
        }
       
        for(int arr[]: roads)
        {
            list.get(arr[0]).add(new int[] {arr[1],arr[2]});
            list.get(arr[1]).add(new int[] {arr[0],arr[2]});
        }
        int min=Integer.MAX_VALUE;
        boolean visited[]= new boolean[n+1];
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        visited[1]=true;
        while(!q.isEmpty())
        {
            int a=q.poll();
            for(int brr[]:list.get(a))
            {
                min=Math.min(min,brr[1]);
                if(!visited[brr[0]])
                {
                    visited[brr[0]]=true;
                    q.add(brr[0]);
                }
            }

        }
        return min;
    }
}