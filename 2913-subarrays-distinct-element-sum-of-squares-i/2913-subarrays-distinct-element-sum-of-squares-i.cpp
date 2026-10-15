class Solution {
public:
    int sumCounts(vector<int>& nums) {
        int n=nums.size();
        int sum=0;
        for(int i=0;i<n;i++)
        {   
            vector<int> temp (101);
            int distinct=0;
            for(int j=i;j<n;j++)
            {
                if(temp[nums[j]]==0)
                {
                    distinct++;
                    temp[nums[j]]++;
                }
                sum+=(distinct*distinct);
            }
        }
        
    return sum;
    }
};