class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
       
        int low=0,high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int x=citations[mid];
            if(x==n-mid)
            return n-mid;
            else if (x>n-mid)
            high=mid-1;
            else
            low=mid+1;
        }
        return n-low;
    }
}