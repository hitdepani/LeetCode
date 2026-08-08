class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        return solve(coins, amount, memo);
    }

    int solve(int[] coins, int amt, int[] memo) {

        if (amt == 0) return 0;      
        if (amt < 0) return -1;     
        if (memo[amt] != 0) return memo[amt]; 
        int min = Integer.MAX_VALUE;

        for (int c : coins) {        
            int res = solve(coins, amt - c, memo);

            if (res >= 0) {
                min = Math.min(min, res + 1);
            }
        }

        memo[amt] = (min == Integer.MAX_VALUE) ? -1 : min;
        return memo[amt];
    }
}
