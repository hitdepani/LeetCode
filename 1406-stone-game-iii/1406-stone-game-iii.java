class Solution {
    // int sol(int i,int stoneValue[],int n,int dp[])
    // {
    //     if(i>=n)
    //     return 0;
        
    //     if(dp[i]!=Integer.MIN_VALUE)
    //     return dp[i];
        
        
    //     return dp[i]=max;
        
    // }
    public String stoneGameIII(int[] stoneValue) {
        int n =stoneValue.length;
        int dp[]= new int[n+1];
        //Arrays.fill(dp,Integer.MIN_VALUE);
        for(int i=n-1;i>=0;i--)
        {
            int y=0;
            dp[i]=Integer.MIN_VALUE;
            for(int j=0;j<3&&i+j<n;j++)
            {
                y+=stoneValue[j+i];
                dp[i]=Math.max(dp[i],y-dp[i+j+1]);
            }
            //dp[i]=max;
        }
        int x=dp[0];
        if(x==0)
        return "Tie";
        else if(x>0)
        return "Alice";
        else
        return "Bob";
    }
}