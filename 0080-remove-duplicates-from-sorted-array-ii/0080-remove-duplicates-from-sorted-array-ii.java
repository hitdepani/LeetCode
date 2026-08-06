class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int k=0;
        int curr=nums[0];
        int x=1;
        int shift=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==curr && x>=2)
            {

                while(i<n && nums[i]==curr)
                {
                    i++;
                    shift++;                  
                    
                }
                if(i<n)
                {
                    nums[i-shift]=nums[i];
                    curr=nums[i];
                    x=1;
                        
                }
            }
            else if(nums[i]==curr &&x<3)
            {
                x++;
                nums[i-shift]=nums[i];
            }
            else
            {
                curr=nums[i];
                x=1;
                nums[i-shift]=nums[i];
            }
        }
        return n-shift;
    }
}