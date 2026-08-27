class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int f=0;
        int h=-prices[0]-fee;
        for(int i=1;i<n;i++)
        {
            f=Math.max(f,h+prices[i]);
            h=Math.max(h,f-prices[i]-fee);
        }
        return f;
    }
}