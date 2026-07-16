class Solution {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; 
    }
    public long gcdSum(int[] nums) {
        int max=0;
        int n=nums.length;
        int pregcd[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>max)
            max=nums[i];
            pregcd[i]=gcd(max,nums[i]);
        }
        Arrays.sort(pregcd);
        long sum=0;
    
            for(int i=0;i<n/2;i++)
        {
            sum+=gcd(pregcd[i],pregcd[n-1-i]);
        }
        
        
       
        return sum;
        
    }
}