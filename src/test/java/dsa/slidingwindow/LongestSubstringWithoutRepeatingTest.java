package dsa.slidingwindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingTest {

    @Test
    void repeatingInTheMiddle() {
        assertEquals(3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void allSameCharacter() {
        assertEquals(1, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void emptyString() {
        assertEquals(0, LongestSubstringWithoutRepeating.lengthOfLongestSubstring(""));
    }

    @Test
    void substringAfterRepeat() {
        assertEquals(3, LongestSubstringWithoutRepeating.lengthOfLongestSubstring("pwwkew"));
    }
}
