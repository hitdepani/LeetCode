class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int i=0,j=0;
        int max=0;
        boolean vachezero=false;
        boolean sidezero=false;
        while(i<n&&nums[i]==0)
        {
                i++;
                sidezero=true;

        }
        j=i;
        int c=0;
        while(i<n &&j<n)
        {
            if(nums[j]==1){
                j++;
            }
            else if(nums[j]==0&&c<1)
            {
                vachezero=true;
                c++;
                j++;
            }
            else if(nums[j]==0&&c==1){
                max=Math.max(max,j-i-1);
                vachezero=true;
                //c=0;
                while(nums[i]!=0)
                i++;
                i++;
                j++;
            }
        }
        if(sidezero && !vachezero)
        return Math.max(max,j-i);
        else
        return Math.max(max,j-i-1);
        }
}