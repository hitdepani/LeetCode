class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int n=grid.size();
        int m=grid[0].size();
        int a=m-1;
        int b=0;
        int c=0;

        while(a>=0&&b<n)
        {
            if(grid[b][a]<0)
            {
                c+=(n-b);
                a--;
            }
            else
            {
                b++;
            }
        }

        return c;
    }
};