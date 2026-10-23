class Solution {
public:
    int sortPermutation(vector<int>& nums) {
        int x=0;
        bool check=true;
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=i)
            {
                if(check)
                {
                    x=nums[i];
                    check=false;
                }
                else
                x=x&nums[i];
            }
        }
        return x;
    }
};