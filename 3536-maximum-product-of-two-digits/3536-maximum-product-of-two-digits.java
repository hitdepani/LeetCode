class Solution {
    public int maxProduct(int n) {
        int max=0,secmax=0;
        while(n>0)
        {
            int x=n%10;
            if(max<x)
            {
                secmax=max;
                max=x;
            }
            else if(secmax<x)
            secmax=x;
            n/=10;
        }
        return secmax*max;
    }
}