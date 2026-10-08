package dsa.stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    @Test
    void nestedAndAdjacentPairs() {
        assertTrue(ValidParentheses.isValid("()[]{}"));
        assertTrue(ValidParentheses.isValid("{[]}"));
    }

    @Test
    void mismatchedTypes() {
        assertFalse(ValidParentheses.isValid("(]"));
    }

    @Test
    void extraCloser() {
        assertFalse(ValidParentheses.isValid("([)]"));
    }

    @Test
    void emptyStringIsValid() {
        assertTrue(ValidParentheses.isValid(""));
    }
}
