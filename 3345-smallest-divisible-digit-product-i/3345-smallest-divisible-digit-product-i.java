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
        while(true)
        {
            int x=pro(n);
            if(x%t==0)
            return n;
            n++;
        }
        
    }
}