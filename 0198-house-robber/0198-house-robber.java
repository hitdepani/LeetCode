class Solution {
    
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int n=nums.length;
        int dp[]= new int[nums.length];
        int x=nums[0];
        int y=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++)
        {
            
            int pick=nums[i]+x;
            int nopick=y;
            int c=Math.max(pick,nopick);
            x=y;
            y=c;
        }
        return y;
    }
}