class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<3)return false;
        int x=-1;
        
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1])return false;
            if(arr[i]<arr[i+1])
            {
                if(x==2)return false;
                x=1;
                
            }
            else
            {
                if(x==-1)return false;
                else
                x=2;
            }
        }
        return x==2;
    }
}