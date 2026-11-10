class Solution {
private:
    int help(int n,int i,vector<int>& costs,vector<int>& dp)
    {
        if(i>=n)
        return 0;
        if(dp[i]!=-1)return dp[i];
        int b=INT_MAX;
        int c=INT_MAX;
        int a=costs[i]+1+help(n,i+1,costs,dp);
        if(i<=n-2)
        b=costs[i+1]+4+help(n,i+2,costs,dp);
        if(i<=n-3)
        c=costs[i+2]+9+help(n,i+3,costs,dp);
        return dp[i]=min(a,min(b,c));
    }
public:
    int climbStairs(int n, vector<int>& costs) {
        vector<int> dp(n+1,-1);
        return help(n,0,costs,dp);
    }
};