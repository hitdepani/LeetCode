class Solution {
    public int uniquePaths(int m, int n) {
        long p=1;
        int k=Math.min(m-1,n-1);
        int t=m+n-2;
        for(int i=1;i<=k;i++)
        p=p*(t-k+i)/i;
        return (int)p;
    }
}