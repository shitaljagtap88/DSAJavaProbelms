package dsa.twopointers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    @Test
    void classicExample() {
        assertEquals(49, ContainerWithMostWater.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void twoLines() {
        assertEquals(1, ContainerWithMostWater.maxArea(new int[] {1, 1}));
    }

    @Test
    void equalEndsUseFullWidth() {
        assertEquals(16, ContainerWithMostWater.maxArea(new int[] {4, 3, 2, 1, 4}));
    }
}
