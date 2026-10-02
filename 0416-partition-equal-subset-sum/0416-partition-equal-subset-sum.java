class Solution {
    //ArrayList<Integer> list= new ArrayList<>();
    boolean help(int nums[],int i,int sum,int totalsum,Boolean dp[][])
    {
        if(totalsum==sum)return true;
        if(i>=nums.length||sum>totalsum)
        {
            return false;
        }
        if(dp[i][sum]!=null) return dp[i][sum];
        return dp[i][sum]=help(nums,i+1,sum+nums[i],totalsum,dp)| help(nums,i+1,sum,totalsum,dp);
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)
        sum+=i;
        if(sum%2!=0)return false;
        sum/=2;
        Boolean dp[][]= new Boolean[nums.length+1][sum+1];
        return help(nums,0,0,sum,dp);
    }
}