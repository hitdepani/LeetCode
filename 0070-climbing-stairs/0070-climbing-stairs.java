class Solution {
    public int pro(int n,int []arr)
    {
        if(n<=3)
        return n;
        if(arr[n]!=0)
        return arr[n];
        arr[n]=pro(n-1,arr)+pro(n-2,arr);
        return arr[n];
        
    }
    public int climbStairs(int n) {
        int arr[]= new int[n+1];
        return pro(n,arr);

    }
}