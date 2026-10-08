package dsa.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum (easy).
 *
 * <p>Given an array of integers {@code nums} and an integer {@code target}, return the indices of
 * the two numbers that add up to {@code target}. Each input has exactly one solution, and the same
 * element may not be used twice.
 *
 * <p>Time: O(n) — one pass with a hash map of value → index.<br>
 * Space: O(n) — the map stores up to n previously seen values.
 */
public final class TwoSum {
    private TwoSum() {}

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer partner = seen.get(target - nums[i]);
            if (partner != null) {
                return new int[] {partner, i};
            }
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two-sum pair exists");
    }
}
