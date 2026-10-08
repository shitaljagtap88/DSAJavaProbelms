package dsa.binarysearch;

/**
 * Binary Search (easy).
 *
 * <p>Given a sorted (non-decreasing) array of integers {@code nums} and a {@code target}, return
 * the index of {@code target}, or {@code -1} if it is not present.
 *
 * <p>Time: O(log n).<br>
 * Space: O(1).
 */
public final class BinarySearch {
    private BinarySearch() {}

    public static int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}
