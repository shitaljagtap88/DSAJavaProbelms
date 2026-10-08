package dsa.twopointers;

/**
 * Valid Palindrome (easy).
 *
 * <p>A phrase is a palindrome if, after converting all uppercase letters into lowercase and
 * removing all non-alphanumeric characters, it reads the same forward and backward.
 *
 * <p>Time: O(n) — each character is inspected a constant number of times.<br>
 * Space: O(1) — two indices, no extra copy of the string.
 */
public final class ValidPalindrome {
    private ValidPalindrome() {}

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
