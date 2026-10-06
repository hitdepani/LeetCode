class Solution {
public:
    int minAddToMakeValid(string s) {
        int n=s.size();
        int ans=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(s[i]=='(')
            {
                if(c<0)
                {
                    ans+=abs(c);
                    c=1;
                }
                else
                c++;
            }
            else
            c--;
        }
        if(c!=0)
        ans+=abs(c);
        return ans;
    }
};