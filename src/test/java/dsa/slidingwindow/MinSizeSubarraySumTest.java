package dsa.slidingwindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinSizeSubarraySumTest {

    @Test
    void findsMinimalWindow() {
        assertEquals(2, MinSizeSubarraySum.minSubArrayLen(7, new int[] {2, 3, 1, 2, 4, 3}));
    }

    @Test
    void singleElementMeetsTarget() {
        assertEquals(1, MinSizeSubarraySum.minSubArrayLen(4, new int[] {1, 4, 4}));
    }

    @Test
    void impossibleReturnsZero() {
        assertEquals(0, MinSizeSubarraySum.minSubArrayLen(11, new int[] {1, 1, 1, 1, 1, 1, 1, 1}));
    }

    @Test
    void wholeArrayNeeded() {
        assertEquals(3, MinSizeSubarraySum.minSubArrayLen(15, new int[] {5, 5, 5}));
    }
}
