package dsa.dp;

import java.util.Arrays;

/**
 * Coin Change (medium, 1D DP).
 *
 * <p>You are given coins of different denominations and a total {@code amount}. Return the fewest
 * number of coins that make up that amount. If it is impossible, return {@code -1}. You may use
 * each denomination infinitely often.
 *
 * <p>Time: O(amount · coins).<br>
 * Space: O(amount) for the 1D DP table.
 */
public final class CoinChange {
    private CoinChange() {}

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int sum = 1; sum <= amount; sum++) {
            for (int coin : coins) {
                if (coin <= sum) {
                    dp[sum] = Math.min(dp[sum], dp[sum - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
