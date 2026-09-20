class Solution {
public:
    int garbageCollection(vector<string>& garbage, vector<int>& travel) {
        int m=0,g=0,p=0;
        int n=garbage.size();
        vector<int> prefix(n,0);
        int lg=0,lp=0,lm=0;
        for(int i=1;i<n;i++)
            prefix[i]=prefix[i-1]+travel[i-1];
        for(int i=0;i<n;i++)
        {
            string t=garbage[i];
            int o=t.size();
            int gg=0,pp=0,mm=0;
            for(int j=0;j<o;j++)
            {
                if(t[j]=='G')
                {
                    gg++;
                }
                if(t[j]=='P')
                {
                    pp++;
                }
                if(t[j]=='M')
                {
                    mm++;
                }
                
            }
            if(gg>0)
            {
                g+=gg;
                lg=i;
            }
            if(pp>0)
            {
                p+=pp;
                lp=i;
            }
            if(mm>0)
            {
                m+=mm;
                lm=i;
            }
            

        }
        return g+prefix[lg]+m+prefix[lm]+p+prefix[lp];
    }
};