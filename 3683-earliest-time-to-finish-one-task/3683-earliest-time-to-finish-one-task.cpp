class Solution {
public:
    int earliestTime(vector<vector<int>>& tasks) {
        int m=300;
        for(int i=0;i<tasks.size();i++)
        {
            m=min(m,tasks[i][0]+tasks[i][1]);
        }
        return m;
    }
};