class Solution {
public:
    int reverse(int x) {
        if(x==INT_MIN)return 0;
        int n=abs(x);
        
        int ans=0;
        while(n>0)
        {
            int x=n%10;
            if(ans>INT_MAX/10||ans>INT_MAX/10+x)
            return 0;
            ans=ans*10+x;
            n/=10;

        }
        if(x<0)return -ans;
        return ans;
    }
};