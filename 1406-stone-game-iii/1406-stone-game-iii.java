class Solution {
    int sol(int i,int stoneValue[],int n,int dp[])
    {
        if(i>=n)
        return 0;
        
        if(dp[i]!=Integer.MIN_VALUE)
        return dp[i];
        int x=0,max=Integer.MIN_VALUE;
        for(int j=0;j<3&&i+j<n;j++)
        {
            x+=stoneValue[j+i];
            max=Math.max(max,x-sol(i+j+1,stoneValue,n,dp));
        }
        return dp[i]=max;
        
    }
    public String stoneGameIII(int[] stoneValue) {
        int n =stoneValue.length;
        int dp[]= new int[n+1];
        Arrays.fill(dp,Integer.MIN_VALUE);
        int x=sol(0,stoneValue,n,dp);
       // return ""+x;
        if(x==0)
        return "Tie";
        else if(x>0)
        return "Alice";
        else
        return "Bob";
    }
}