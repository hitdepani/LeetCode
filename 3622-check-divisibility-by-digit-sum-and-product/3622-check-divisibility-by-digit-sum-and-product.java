class Solution {
    int sum(int n)
    {
        int c=0;
        while(n>0)
        {
            c+=n%10;
            n/=10;
        }
        return c;
    }
    int pro(int n)
    {
        int c=1;
        while(n>0)
        {
            c*=n%10;
            n/=10;
        }
        return c;
    }
    
    public boolean checkDivisibility(int n) {
        return (n%(sum(n)+pro(n))==0);
    }
}