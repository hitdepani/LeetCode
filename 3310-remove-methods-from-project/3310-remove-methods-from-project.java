class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> adj= new ArrayList<>();
        List<Integer> list=  new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<invocations.length;i++)
        {
            int x=invocations[i][0];
            int y=invocations[i][1];
            adj.get(x).add(y);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(k);
        boolean sup[]= new boolean[n];
        sup[k]=true;
        while(!q.isEmpty())
        {
            int temp=q.poll();
            for(int x:adj.get(temp))
            {
                if(!sup[x])
                {
                    sup[x]=true;
                    q.add(x);
                }
            }
        }
        boolean check=true;
        for(int i=0;i<invocations.length;i++)
        {
            int x=invocations[i][0];
            int y=invocations[i][1];
            if(sup[x]==false &&sup[y]==true)
            {
                check=false;
                break;
            }
            
        }
        for(int i=0;i<n;i++)
        {
            if(check)
            {
                if(!sup[i])
                list.add(i);
            }
            else 
            list.add(i);
        }
        return list;
    }
}