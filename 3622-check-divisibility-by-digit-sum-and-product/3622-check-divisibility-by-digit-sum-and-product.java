class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0,pro=1;
        int m=n;
        while(n>0)
        {
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        return m%(sum+pro)==0;
    }
}