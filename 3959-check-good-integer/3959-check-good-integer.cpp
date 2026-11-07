class Solution {
public:
    bool checkGoodInteger(int n) {
        int d=0;
        int s=0;
        int temp=n;
        while(temp>0)
        {
            d+=(temp%10);
            s+=((temp%10) * (temp%10));
            temp/=10;
        }
        return s-d>=50;
    }
};