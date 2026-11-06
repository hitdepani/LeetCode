class Solution {
public:
    vector<int> countServers(int n, vector<vector<int>>& logs, int x, vector<int>& queries) {
        int m=queries.size();
        vector<pair<int,int>> q (m);
        for(int i=0;i<m;i++)
        {
            q[i]={queries[i],i};
        }
        sort(q.begin(),q.end());
        sort(logs.begin(),logs.end(),[](const vector<int>& a,const vector<int>& b){return a[1]<b[1];});
        vector<int> ans(m);
        vector<int> freq(n+1,0);
        int ac=0,l=0,r=0,size=logs.size();
        for(int i=0;i<m;i++)
        {
            int cc=q[i].first;
            int dd=q[i].second;
            while(r<size&&logs[r][1]<=cc)
            {
                if(freq[logs[r][0]]++==0)
                ac++;
                r++;
            }
            while(l<size&&logs[l][1]<cc-x)
            {
                if(--freq[logs[l][0]]==0)
                ac--;
                l++;
            }
            ans[dd]=n-ac;
        }
        return ans;
    }
};