class Solution {
public:
    bool checkPerfectNumber(int num) {
        if(num==1)return false;
        int n=num;
        long sum=1;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                 sum+=i;
                 if(i*i!=num)
                 sum+=(num/i);
            }
           
        }
        return sum==num;
    }
};