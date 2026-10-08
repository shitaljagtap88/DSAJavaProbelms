package dsa.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * Valid Parentheses (easy).
 *
 * <p>Given a string containing only {@code ()[]{}}, determine if the input is valid: every open
 * bracket is closed by the same type, in the correct order, and every close has a matching open.
 *
 * <p>Time: O(n).<br>
 * Space: O(n) for the stack in the worst case (all openers).
 */
public final class ValidParentheses {
    private static final Map<Character, Character> OPEN_FOR_CLOSE =
            Map.of(')', '(', ']', '[', '}', '{');

    private ValidParentheses() {}

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Character expectedOpen = OPEN_FOR_CLOSE.get(c);
            if (expectedOpen == null) {
                stack.push(c);
            } else if (stack.isEmpty() || stack.pop() != expectedOpen) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
