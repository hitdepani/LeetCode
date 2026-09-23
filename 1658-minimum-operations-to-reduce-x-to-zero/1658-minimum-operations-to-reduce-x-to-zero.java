class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int total=0;
        for(int y:nums)
        total+=y;
        int target=total-x;
        int max=-1;
        int curr=0;
        int i=0;
        if(target<0)return -1;
        if(target==0)return n;
        for(int j=0;j<n;j++)
        {
            
            curr+=nums[j];
            while(curr>target)
            {
                curr-=nums[i];
                i++;
            }
            if(curr==target)
            max=Math.max(max,j-i+1);
            

        }
        if(max==-1)return -1;
        return (n-max);
    }
}