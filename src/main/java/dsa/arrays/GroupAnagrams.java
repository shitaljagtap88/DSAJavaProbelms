package dsa.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Group Anagrams (medium).
 *
 * <p>Given an array of strings, group the anagrams together. Anagrams contain the same characters
 * with the same frequencies, in any order.
 *
 * <p>Time: O(n · k) where n is the number of strings and k is the max length — each string is
 * hashed from a 26-count signature.<br>
 * Space: O(n · k) for the grouped output (and the map of signatures).
 */
public final class GroupAnagrams {
    private GroupAnagrams() {}

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            groups.computeIfAbsent(signature(s), unused -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(groups.values());
    }

    private static String signature(String s) {
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }
        StringBuilder key = new StringBuilder(52);
        for (int c : counts) {
            key.append('#').append(c);
        }
        return key.toString();
    }
}
