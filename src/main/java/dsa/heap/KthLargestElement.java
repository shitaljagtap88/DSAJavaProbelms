import java.util.PriorityQueue;

/**
 * Find the Kth largest element in an unsorted array.
 *
 * Uses a min-heap of size K: the root is always the Kth largest seen so far.
 * Time: O(n log k). Extra space: O(k).
 */
public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {
        if (nums == null || k < 1 || k > nums.length) {
            throw new IllegalArgumentException("k must be between 1 and the array length");
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("Array: [3, 2, 1, 5, 6, 4]");
        System.out.println(ordinal(k) + " largest: " + findKthLargest(nums, k));

        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println("Array: [3, 2, 3, 1, 2, 4, 5, 5, 6]");
        System.out.println(ordinal(k2) + " largest: " + findKthLargest(nums2, k2));
    }

    private static String ordinal(int k) {
        int mod100 = k % 100;
        if (mod100 >= 11 && mod100 <= 13) {
            return k + "th";
        }
        switch (k % 10) {
            case 1:
                return k + "st";
            case 2:
                return k + "nd";
            case 3:
                return k + "rd";
            default:
                return k + "th";
        }
    }
}
