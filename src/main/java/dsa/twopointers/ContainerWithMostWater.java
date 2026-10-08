package dsa.twopointers;

/**
 * Container With Most Water (medium).
 *
 * <p>You are given {@code height[i]} — the height of a vertical line at x = i. Choose two lines
 * that, together with the x-axis, form a container holding the most water. Lines cannot be slanted.
 *
 * <p>Time: O(n) — start at both ends and always move the shorter side inward.<br>
 * Space: O(1).
 */
public final class ContainerWithMostWater {
    private ContainerWithMostWater() {}

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int best = 0;
        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            best = Math.max(best, width * h);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return best;
    }
}
