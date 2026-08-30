class Solution {
    public int minimumDeletions(int[] nums) {
        int minidx=-1,maxidx=-1;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(min>nums[i])
            {
                minidx=i;
                min=nums[i];
            }
            if(max<nums[i])
            {
                maxidx=i;
                max=nums[i];
            }
        }
        int a=Math.max(minidx,maxidx)+1;
        int b=n-Math.min(minidx,maxidx);
        int d=maxidx+1+(n-minidx);
        int e=minidx+1+(n-maxidx);
        return Math.min(a,Math.min(b,Math.min(d,e)));
    }
}