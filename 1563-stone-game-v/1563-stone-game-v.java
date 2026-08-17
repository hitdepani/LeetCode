class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n=stoneValue.length;

        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++) 
        Arrays.fill(dp[i],-1);

        return sol(0,n-1,stoneValue,dp);
    }

    int sol(int i, int j, int[] stoneValue, int[][] dp){
        if(i== j) 
        return 0;
        if(dp[i][j]!=-1) 
        return dp[i][j];

        int total=0;

        for(int k=i;k<=j;k++)
        {
            total+=stoneValue[k];
        }

        int left=0;
        int right=0;

        int max=0;

        for(int k=i;k<j;k++){
            left+=stoneValue[k];
            right=total-left;
            
            if(left==right){
                int l=left+sol(i,k,stoneValue,dp);


                int r=right+sol(k+1,j,stoneValue,dp);
                max= Math.max(max, Math.max(l,r));
            }
            else if(left<right){
                max=Math.max(max,left+sol(i,k,stoneValue,dp));
            }
            else{
                max= Math.max(max,right+sol(k+1,j,stoneValue,dp));
            }
        }
        return dp[i][j]=max;
    }
}