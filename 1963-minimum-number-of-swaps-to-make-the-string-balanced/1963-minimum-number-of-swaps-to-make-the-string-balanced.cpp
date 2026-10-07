class Solution {
public:
    int minSwaps(string s) {
        int n=s.size();
        vector<char> vec(s.begin(), s.end());
        int i=0,j=n-1;
        int open=0,close=0;
        int ans=0;
        while(i<j)
        {
            if(vec[i]=='[')
            {
                open++;
            }
            else
            close++;
            if(close>open)
            {
                while(j>=0)
                {
                    if(vec[j]=='[')
                    {
                        vec[i]='[';
                        vec[j]=']';
                        j--;
                        close--;
                        open++;
                        ans++;
                        break;
                    }
                    else
                    j--;
                }
            }
            i++;
        }
        return ans;
    }
};