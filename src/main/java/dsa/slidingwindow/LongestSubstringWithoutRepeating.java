package dsa.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Substring Without Repeating Characters (medium).
 *
 * <p>Given a string {@code s}, return the length of the longest substring that contains no
 * repeating characters.
 *
 * <p>Time: O(n) — each index enters and leaves the window at most once.<br>
 * Space: O(min(n, Σ)) for the last-seen index of each character.
 */
public final class LongestSubstringWithoutRepeating {
    private LongestSubstringWithoutRepeating() {}

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastIndex = new HashMap<>();
        int left = 0;
        int best = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            Integer prev = lastIndex.get(c);
            if (prev != null && prev >= left) {
                left = prev + 1;
            }
            lastIndex.put(c, right);
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
