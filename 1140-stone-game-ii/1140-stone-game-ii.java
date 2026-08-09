class Solution {
    int sol(int piles[],int i,int m,int ss[],Integer[][] dp)
    {
        if(i>=piles.length)
        return 0;
        if(dp[i][m]!=null)
        return dp[i][m];
        int max=0;
        for(int j=1;j<=2*m && (i+j)<=piles.length;j++)
        {
            
            int x=ss[i]-sol(piles,i+j,Math.max(m,j),ss,dp);
            max=Math.max(max,x);
        }
        return dp[i][m]=max;

    }
    public int stoneGameII(int[] piles) {
        int n=piles.length;
        int ss[]= new int[n];
        ss[n-1]=piles[n-1];
        Integer[][] dp=new Integer[n][n+1];
        for(int i=n-2;i>=0;i--)
        {
            ss[i]=ss[i+1]+piles[i];
        }
        return sol(piles,0,1,ss,dp);
    }
}