class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long m=0,c=0;
        while(n>0)
        {
            sum+=n%10;
            if(n%10 !=0)
            m=(n%10)+ m*10;
            n/=10;
        }
        long rev= 0;
    
        while (m != 0) 
        {
            long digit=m% 10;          
            rev=rev*10+digit; 
            m/=10;                    
        }
        return rev*sum;
        
    }
}