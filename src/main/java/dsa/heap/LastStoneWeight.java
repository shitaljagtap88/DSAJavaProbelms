package dsa.heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Last Stone Weight (easy).
 *
 * <p>Each turn, smash the two heaviest stones. If they have equal weight both are destroyed;
 * otherwise the heavier one is replaced by the difference. Repeat until at most one stone remains.
 * Return that stone's weight, or 0 if none remain.
 *
 * <p>Time: O(n log n) for n heap operations.<br>
 * Space: O(n) for the max-heap.
 */
public final class LastStoneWeight {
    private LastStoneWeight() {}

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            maxHeap.add(stone);
        }
        while (maxHeap.size() > 1) {
            int first = maxHeap.poll();
            int second = maxHeap.poll();
            if (first != second) {
                maxHeap.add(first - second);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
