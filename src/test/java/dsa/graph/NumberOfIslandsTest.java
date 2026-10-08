package dsa.graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumberOfIslandsTest {

    @Test
    void multipleIslands() {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, NumberOfIslands.numIslands(grid));
    }

    @Test
    void allWater() {
        assertEquals(0, NumberOfIslands.numIslands(new char[][] {{'0', '0'}, {'0', '0'}}));
    }

    @Test
    void emptyGrid() {
        assertEquals(0, NumberOfIslands.numIslands(new char[0][0]));
    }

    @Test
    void oneIsland() {
        char[][] grid = {
            {'1', '1', '1'},
            {'0', '1', '0'},
            {'1', '1', '1'}
        };
        assertEquals(1, NumberOfIslands.numIslands(grid));
    }
}
