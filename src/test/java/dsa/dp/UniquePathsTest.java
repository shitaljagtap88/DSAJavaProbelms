package dsa.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UniquePathsTest {

    @Test
    void threeBySevenGrid() {
        assertEquals(28, UniquePaths.uniquePaths(3, 7));
    }

    @Test
    void squareGrid() {
        assertEquals(6, UniquePaths.uniquePaths(3, 3));
    }

    @Test
    void singleRowOrColumn() {
        assertEquals(1, UniquePaths.uniquePaths(1, 5));
        assertEquals(1, UniquePaths.uniquePaths(4, 1));
    }
}
