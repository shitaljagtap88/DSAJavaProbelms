package dsa.binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void findsExistingTarget() {
        assertEquals(4, BinarySearch.search(new int[] {-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    void missingTarget() {
        assertEquals(-1, BinarySearch.search(new int[] {-1, 0, 3, 5, 9, 12}, 2));
    }

    @Test
    void singleElement() {
        assertEquals(0, BinarySearch.search(new int[] {5}, 5));
        assertEquals(-1, BinarySearch.search(new int[] {5}, 0));
    }
}
