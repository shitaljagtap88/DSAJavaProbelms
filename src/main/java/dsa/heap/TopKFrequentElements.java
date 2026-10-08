package dsa.heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Top K Frequent Elements (medium).
 *
 * <p>Given an integer array {@code nums} and an integer {@code k}, return the {@code k} most
 * frequent elements. Order of the returned elements does not matter.
 *
 * <p>Time: O(n log k) — count frequencies in O(n), then maintain a min-heap of size k.<br>
 * Space: O(n) for the frequency map plus O(k) for the heap.
 */
public final class TopKFrequentElements {
    private TopKFrequentElements() {}

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.merge(num, 1, Integer::sum);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>(Map.Entry.comparingByValue());
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        List<Integer> result = new ArrayList<>(k);
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().getKey());
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
