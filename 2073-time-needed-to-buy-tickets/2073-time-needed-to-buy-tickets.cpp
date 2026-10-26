class Solution {
public:
    int timeRequiredToBuy(vector<int>& tickets, int k) {
        queue<int> q;
        int n=tickets.size();
        for(int i=0;i<n;i++)
        {
            q.push(i);
        }
        int c=0;
        while(tickets[k]!=0)
        {
            c++;
            tickets[q.front()]--;
            if(tickets[q.front()]!=0)
            {
                q.push(q.front());
                q.pop();
            }
            else
            q.pop();
        }
        return c;
    }
};