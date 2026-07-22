class Solution {
    public int pro(int n,int []arr)
    {
        
        if(arr[n]!=0)
        return arr[n];
        arr[n]=pro(n-1,arr)+pro(n-2,arr);
        return arr[n];
        
    }
    public int climbStairs(int n) {
        if(n<=3)
        return n;
        int x=2;
        int y=3;
        for(int i=4;i<=n;i++)
        {
            int c=x+y;
            x=y;
            y=c; 
        }
        return y;
        }
}