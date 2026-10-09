class Solution {
public:
    int minInsertions(string s) {
        int n=s.size();
        int result=0;
        int x=0;
        for(int i=0;i<n;i++)
        {
            if(s[i]=='(')
            {
                if(x<0)
                {
                    x=abs(x);
                    if(x%2==0)
                    result+=(x/2);
                    else
                    result+=((x/2)+2);
                    x=2;
                }
                else
                {
                    if(x%2!=0)
                    {
                        result+=1;
                        x-=1;
                    }
                    x+=2;
                }
            }
            else
            {
                x-=1;
            }
        }
        if(x>0)
        {
            result+=(x);
        }
        else if(x<0)
        {
            x=abs(x);
            if(x%2==0)
            result+=(x/2);
            else
            result+=((x/2)+2);
        }
        return result;
    }
};