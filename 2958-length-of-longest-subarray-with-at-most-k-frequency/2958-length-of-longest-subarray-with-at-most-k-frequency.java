class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int n=nums.length;
        int i=0,j=0;
        int max=0;
        for( j=0;j<n;j++)
        {
            map.put(nums[j],map.getOrDefault(nums[j], 0)+1);
            while(map.get(nums[j])>k)
            {
                map.put(nums[i],map.get(nums[i])-1);
                i++;
            }
            // if(map.containsKey(nums[j]))
            // {
            //     if(map.getOrDefault(nums[j],0)==k)
            //     {
            //         while(nums[i]!=nums[j])
            //         {
            //             if(map.getOrDefault(nums[i],0)>0)
                            
            //                 i++;
                            
            //         }
                   
            //         if(map.getOrDefault(nums[i], 0)>0)
            //                 map.put(nums[i],map.get(nums[i])-1);
            //         i++;
            //         map.put(nums[j],map.get(nums[j])+1);
            //     }
            //     else
            //     map.put(nums[j],map.get(nums[j])+1);
            // }
            // else
            // {
            //     map.put(nums[j],1);
            // }
            max=Math.max(max,j-i+1);
           // j++;
            
        }
        return max;
    }
}