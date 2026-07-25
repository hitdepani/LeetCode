class Solution {
    public int sol(int nums[],int i,int arr[])
    {
        if(i<0)
        return 0;
        if(arr[i]!=-1)
        return arr[i];
        int pick=nums[i]+sol(nums,i-2,arr);
        
        int nopick=sol(nums,i-1,arr);
        return arr[i]=Math.max(pick,nopick);

    }
    public int rob(int[] nums) {
        int arr[]= new int[nums.length+1];
        Arrays.fill(arr, -1);
        return sol(nums,nums.length-1,arr);
    }
}