class Solution {
private:
    int help(int n,char x,vector<vector<int>>& dp)
    {
        if(n==0)
        {
            return 1;
        }
        if(dp[n][x-'a']!=-1)
        return dp[n][x-'a'];
        int a=0,e=0,i=0,o=0,u=0;
        if(x!='e'&&x!='i'&&x!='o'&&x!='u')
        a=help(n-1,'a',dp);
        if(x!='i'&&x!='o'&&x!='u')
        e=help(n-1,'e',dp);
        if(x!='o'&&x!='u')
        i=help(n-1,'i',dp);
        if(x!='u')
        o=help(n-1,'o',dp);
        u=help(n-1,'u',dp);
        return dp[n][x-'a']=a+e+i+o+u;
    }
public:
    int countVowelStrings(int n) {
        vector<vector<int>> dp(51, vector<int>(26, -1));
        return help(n,'a',dp);
    }
};