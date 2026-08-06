class Solution {
    int pro(int n)
    {
        int x=1;
        while(n>0)
        {
            x*=n%10;
            n/=10;
        }
        return x;
    }
    public int smallestNumber(int n, int t) {
        while(pro(n)%t!=0)
        {
            n++;
        }
        return n;
        
    }
}