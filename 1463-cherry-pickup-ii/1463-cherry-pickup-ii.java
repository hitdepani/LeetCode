class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][][] = new int[n][m][m];
        for (int j = 0; j < m - 1; j++) {
            for (int l = 0; l < m; l++) {
                if (j == l)
                    dp[n - 1][j][l] = grid[n - 1][l];
                else
                    dp[n - 1][j][l] = grid[n - 1][j] + grid[n - 1][l];

            }
        }
        for (int c = n - 2; c >= 0; c--) {
            for (int d = m - 1; d >= 0; d--) {
                for (int e = m - 1; e >= 0; e--) {

                    int max = Integer.MIN_VALUE;
                    for (int a = -1; a < 2; a++) {
                        for (int b = -1; b < 2; b++) {
                            int temp = 0;
                            if (d == e)
                                temp = grid[c][d];
                            else

                                temp = grid[c][d] + grid[c][e];
                            if (d + a >= 0 && d + a < m && e + b >= 0 && e + b < m)
                                temp += dp[c + 1][d + a][e + b];
                            else
                                temp += -1e8;
                            max = Math.max(max, temp);

                        }
                    }
                    dp[c][d][e] = max;
                }
            }
        }
        return dp[0][0][m - 1];
    }
}