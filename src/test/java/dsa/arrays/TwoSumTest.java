package dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void findsPairInTheMiddle() {
        assertArrayEquals(new int[] {0, 1}, TwoSum.twoSum(new int[] {2, 7, 11, 15}, 9));
    }

    @Test
    void usesLaterDuplicateValue() {
        assertArrayEquals(new int[] {1, 2}, TwoSum.twoSum(new int[] {3, 2, 4}, 6));
    }

    @Test
    void sameValueTwice() {
        assertArrayEquals(new int[] {0, 1}, TwoSum.twoSum(new int[] {3, 3}, 6));
    }

    @Test
    void rejectsWhenNoPairExists() {
        assertThrows(IllegalArgumentException.class, () -> TwoSum.twoSum(new int[] {1, 2, 3}, 100));
    }
}
