package dsa.dp;

/**
 * Unique Paths (medium, 2D DP).
 *
 * <p>A robot sits on an {@code m × n} grid at the top-left cell and may only move right or down.
 * Return how many unique paths it can take to the bottom-right cell.
 *
 * <p>Time: O(m · n).<br>
 * Space: O(n) using a rolling 1D row (equivalent to classic 2D DP).
 */
public final class UniquePaths {
    private UniquePaths() {}

    public static int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (col > 0) {
                    dp[col] += dp[col - 1];
                }
            }
        }
        return dp[n - 1];
    }
}
