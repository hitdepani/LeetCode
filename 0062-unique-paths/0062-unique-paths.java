class Solution {
    int sol(int n,int m,int dp[][])
    {
        if(n<0||m<0)
        return 0;
        else if(n==0&&m==0)
        return 1;
        else if(dp[n][m]!=0)
        return dp[n][m];
        else 
             dp[n][m]=sol(n-1,m,dp)+sol(n,m-1,dp);
             return dp[n][m];
        

    }
    public int uniquePaths(int m, int n) {
        long p=1;
        int k=Math.min(m-1,n-1);
        int t=m+n-2;
        for(int i=1;i<=k;i++)
        p=p*(t-k+i)/i;
        return (int)p;
    }
}