class Solution {
public:
    int sumCounts(vector<int>& nums) {
        int n=nums.size();
        int sum=n;
        for(int i=0;i<n;i++)
        {   
            vector<int> temp (101);
            temp[nums[i]]++;
            int distinct=1;
            for(int j=i+1;j<n;j++)
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