package dsa.binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayTest {

    @Test
    void findsTargetOnRightHalf() {
        assertEquals(4, SearchInRotatedSortedArray.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    void missingTarget() {
        assertEquals(-1, SearchInRotatedSortedArray.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    void notRotated() {
        assertEquals(2, SearchInRotatedSortedArray.search(new int[] {1, 2, 3, 4, 5}, 3));
    }

    @Test
    void singleElement() {
        assertEquals(-1, SearchInRotatedSortedArray.search(new int[] {1}, 0));
        assertEquals(0, SearchInRotatedSortedArray.search(new int[] {1}, 1));
    }
}
