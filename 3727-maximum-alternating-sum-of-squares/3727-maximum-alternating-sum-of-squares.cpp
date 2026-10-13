class Solution {
public:
    long long maxAlternatingSum(vector<int>& nums) {
        int n=nums.size();
        for(int i=0;i<n;i++)
        nums[i]=abs(nums[i]);
        sort(nums.begin(),nums.end());
        long long sum=0;
        for(int i=0;i<n/2;i++)
        {
            sum-=(nums[i]*nums[i]);
            sum+=(nums[n-i-1]*nums[n-i-1]);
        }
        if(n%2==1)
        sum+=(nums[n/2]*nums[n/2]);
        return sum;
    }
};