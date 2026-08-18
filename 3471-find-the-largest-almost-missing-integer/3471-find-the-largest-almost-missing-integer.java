class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(k==n)
        {
            int max=0;
            for(int i=0;i<n;i++)
            {
                max=Math.max(max,nums[i]);
            }
            return max;
        }
        else if(k==1)
        {
            int arr[]= new int[51];
            for(int i=0;i<n;i++)
            {
                arr[nums[i]]++;
            }
            int max=-1;
            for(int i=0;i<=50;i++)
            {
                if(arr[i]==1)
                max=Math.max(i,max);
            }
            return max;
        }
        else
        {
            int arr[]= new int[51];
            for(int i=0;i<n;i++)
            {
                arr[nums[i]]++;
            }
            if(arr[nums[0]]>1&&arr[nums[n-1]]>1)
            return -1;
            else if(arr[nums[0]]==1&&arr[nums[n-1]]==1)
            return Math.max(nums[0],nums[n-1]);
            else
            {
                if(arr[nums[0]]>1)
                return nums[n-1];
                else
                return nums[0];
            }
        }
    }
}