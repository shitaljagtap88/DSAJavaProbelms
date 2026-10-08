package dsa.twopointers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    @Test
    void ignoresPunctuationAndCase() {
        assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void rejectsNonPalindrome() {
        assertFalse(ValidPalindrome.isPalindrome("race a car"));
    }

    @Test
    void emptyAfterFilteringIsPalindrome() {
        assertTrue(ValidPalindrome.isPalindrome(".,"));
    }

    @Test
    void singleLetter() {
        assertTrue(ValidPalindrome.isPalindrome("a"));
    }
}
