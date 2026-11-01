class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int sum=0;
        int x=nums[0];
        for(int i=1;i<n;i++)
        {
            x=Math.min(x,nums[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]-x>0)
            sum+=(nums[i]-x);
        }
        return sum;
    }
}