class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        int c=k;
        boolean check=true;
        while(check)
        {
            int x=c;
            for(int i=0;i<n;i++)
            {
                if(nums[i]==c)
                c+=k;
            }
            if(x==c)
            return c;
        }
        return 0;
    }
}