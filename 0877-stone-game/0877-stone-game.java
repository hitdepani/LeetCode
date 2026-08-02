class Solution {
    int sol(int piles[],int i,int j,int dp[][])
    {
        if(i>j)
        return 0;
        if(dp[i][j]!=0)
        return dp[i][j];
        
        if(i==j)
        return piles[i];
        int left=piles[i]-sol(piles,i+1,j,dp);
        int right=piles[j]-sol(piles,i,j-1,dp);
        return dp[i][j]=Math.max(left,right);
        
    }
    public boolean stoneGame(int[] piles) {
        int dp[][]= new int[piles.length][piles.length];
        int x=sol(piles,0,piles.length-1,dp);
        if(x>=0)return true;
        else return false;
    }
}