class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE,max=0;

        for(int i=0;i<n;i++)
        {
            if(min>nums[i])
            min=nums[i];
            if(max<nums[i])
            max=nums[i];
        }
        int arr[]=new int[max-min+1];
        for(int i=0;i<n;i++)
        {
            arr[nums[i]-min]++;
        }
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<(max-min+1);i++)
        {
            if(arr[i]==0)
            list.add(i+min);
        }
        return list;

    }
}