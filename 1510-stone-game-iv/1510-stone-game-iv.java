class Solution {
    boolean sol(int n,Boolean dp[])
    {
        
        if(n==0)
        return false;
        if(dp[n]!=null)
        return dp[n];
        for(int i=1;i*i<=n;i++)
        {
            int x=n-(i*i);
            if(sol(x,dp)==false)
            return dp[n]=true;
        }
        return dp[n]=false;

    }
    public boolean winnerSquareGame(int n) {
       Boolean dp[]= new Boolean[n+1];
       return sol(n,dp);
    }
}