class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if(costBoth<=cost1 && costBoth<=cost2)
        {
            if(need1>need2)
                return (long)need1*costBoth;
            else
                return (long)need2*costBoth;
        }
        else if(costBoth<=(cost1+cost2))
        {
            if(need1<need2)
            {
                return ((long)need1*costBoth)+(long)Math.min(((long)(need2-need1)*cost2),(long)(need2-need1)*costBoth);
            }
            else
            {
                return ((long)need2*costBoth)+(long)Math.min(((long)(need1-need2)*cost1),(long)(need1-need2)*costBoth);
            }
        }
        else
        {
            return ((long)cost1*need1)+((long)cost2*need2);
        }
    }
}