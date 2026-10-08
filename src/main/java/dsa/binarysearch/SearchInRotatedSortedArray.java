package dsa.binarysearch;

/**
 * Search in Rotated Sorted Array (medium).
 *
 * <p>{@code nums} is a distinct-valued array that was sorted in ascending order and then rotated
 * at an unknown pivot. Return the index of {@code target}, or {@code -1} if it is absent. The
 * solution must run in O(log n).
 *
 * <p>Time: O(log n) — at each step one half is still sorted, so we can discard it.<br>
 * Space: O(1).
 */
public final class SearchInRotatedSortedArray {
    private SearchInRotatedSortedArray() {}

    public static int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[lo] <= nums[mid]) {
                if (nums[lo] <= target && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
}
