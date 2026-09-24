class Solution {
    int sum(int x)
    {
        int c=0;
        while(x>0)
        {
            c+=x%10;
            x/=10;
        }
        return c;
    }
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(sum(nums[i])==i)
            return i;
        }
        return -1;
    }
}