class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1]+1)
            sum+=nums[i];
            else
            break;
        }
        int y=sum;
        boolean check=true;
        while(check)
        {
            for(int x:nums)
            {
                if(x==sum)
                {
                    sum++;
                }
            }
            if(y==sum)
            check=false;
            else
            y=sum;
        }
        return y;
        
    }
}