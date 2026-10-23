class Solution {
    
public:
bool check(vector<int>& piles,int h,long x)
    {
        long long sum=0;
        for(int i=0;i<piles.size();i++)
        {
            sum += (piles[i] + x - 1) / x;
        }
        return (sum<=h);
    }
    int minEatingSpeed(vector<int>& piles, int h) {
        int m=piles[0];
        for(int i:piles)
        m=max(m,i);
        long low=1,high=m;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(check(piles,h,mid))
            {
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return low;
    }
};