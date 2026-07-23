class Solution {
    public int maxProfit(int[] prices) {
        int max=0,sum=0;
        int n=prices.length;
        for(int i=n-1;i>=0;i--)
        {
            if(prices[i]>max)
            max=prices[i];
            if(prices[i]<max)
            {
                sum+=max-prices[i];
                max=prices[i];
            }
        }
        return sum;
    }
}