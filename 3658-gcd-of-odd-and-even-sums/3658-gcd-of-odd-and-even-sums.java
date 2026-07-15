class Solution {
    public int gcdOfOddEvenSums(int n) {
        int x=n*n;//odd;
        int y=n*(n-1);//even
        for(int i=Math.min(x,y);i>0;i--)
        {
            if(x%i==0 &&y%i==0)
            return i;
        }
        return 1;
    }
    
}