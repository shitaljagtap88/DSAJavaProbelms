package dsa.slidingwindow;

/**
 * Minimum Size Subarray Sum (medium).
 *
 * <p>Given a positive integer {@code target} and an array of positive integers {@code nums},
 * return the minimal length of a contiguous subarray whose sum is at least {@code target}. Return
 * 0 if no such subarray exists.
 *
 * <p>Time: O(n) — expanding/shrinking a sliding window over positive numbers.<br>
 * Space: O(1).
 */
public final class MinSizeSubarraySum {
    private MinSizeSubarraySum() {}

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        long sum = 0;
        int best = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                best = Math.min(best, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return best == Integer.MAX_VALUE ? 0 : best;
    }
}
