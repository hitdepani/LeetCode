class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int x=n*m;
        k=k%x;
        int c=0;
        int temp[]= new int[x];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            temp[c++]=grid[i][j];
        }
        int newtemp[]= new int[x];
        for(int i=0;i<x;i++)
        newtemp[(i+k)%x]=temp[i];
        List<List<Integer>> res = new ArrayList<>();
        c=0;
        for(int i=0;i<n;i++)
        {
            List<Integer> r = new ArrayList<>();
            for(int j=0;j<m;j++)
            {
                r.add(newtemp[c++]);
            }
            res.add(r);
        }
        return res;


        
    }
}