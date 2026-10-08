package dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Daily Temperatures (medium).
 *
 * <p>Given a list of daily temperatures, return an array {@code answer} where {@code answer[i]} is
 * the number of days you have to wait after day {@code i} to get a warmer temperature. If there is
 * no future day for which this is possible, {@code answer[i] = 0}.
 *
 * <p>Time: O(n) — each index is pushed and popped at most once on a monotonic decreasing stack.<br>
 * Space: O(n) for the stack and the output array.
 */
public final class DailyTemperatures {
    private DailyTemperatures() {}

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> decreasing = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!decreasing.isEmpty() && temperatures[i] > temperatures[decreasing.peek()]) {
                int prev = decreasing.pop();
                answer[prev] = i - prev;
            }
            decreasing.push(i);
        }
        return answer;
    }
}
