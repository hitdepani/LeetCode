class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int n=nums.length;
        if(n==2)
        return Math.max(nums[0],nums[1]);
        int dp[]= new int[nums.length];
        int x=nums[0];
        int y=Math.max(nums[0],nums[1]);
        for(int i=2;i<n-1;i++)
        {
            
            int pick=nums[i]+x;
            int nopick=y;
            int c=Math.max(pick,nopick);
            x=y;
            y=c;
        }
        int one= y;
        Arrays.fill(dp,0);
        x=nums[1];
        y=Math.max(nums[1],nums[2]);
        for(int i=3;i<n;i++)
        {
            
            int pick=nums[i]+x;
            int nopick=y;
            int c=Math.max(pick,nopick);
            x=y;
            y=c;
        }
        int two=y;
        return Math.max(one,two);
    }
}