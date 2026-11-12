class Solution {
public:
    int longestMonotonicSubarray(vector<int>& nums) {
        int inc=1,dec=1,c=1,d=1;
        int n=nums.size();
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]<nums[i+1])
            c++;
            else
            {
                c=1;
            }
            if(nums[i]>nums[i+1])
            {
                d++;
            }
            else
            {
                d=1;
            }
            inc=max(inc,c);
            dec=max(dec,d);
        }
        
        return max(inc,dec);
    }
};