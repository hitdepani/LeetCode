class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int score = 0;
        int n = img1.length;
        int best = 0;

        for (int dx = -n + 1; dx <= n - 1; dx++) {
            for (int dy = -n + 1; dy <= n - 1; dy++) {
                score = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        int c = 0;
                        if (dx + i >= 0 && dx + i < n && dy + j >= 0 && dy + j < n) {
                            c = img1[dx + i][dy + j];
                        }
                        score += (img2[i][j] & c);
                    }
                }
                best = Math.max(best, score);
            }
        }
        return best;
    }
}