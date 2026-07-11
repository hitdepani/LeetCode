class Solution {
    int p[];
    public int countCompleteComponents(int n, int[][] edges) {
        p=new int[n];
        int v[]=new int[n];
        int e[]=new int[n];
        for(int i=0;i<n;i++)
        {
            p[i]=i;
            v[i]=1;
        }
        for(int arr[] :edges)
        {
            int x=find(arr[0]);
            int y=find(arr[1]);
            if(x!=y)
            {
                p[x]=y;
                v[y]+=v[x];
                e[y]+=e[x]+1;

            }
            else
            {
                e[x]++;
            }
        }
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(p[i]==i)
            {
                if(e[i]==((v[i]*(v[i]-1))/2))
                res++;
            }
        }
        return res;
    }
    int find(int i)
    {
        if(p[i]==i)return i;
        return p[i]=find(p[i]);
    }
}