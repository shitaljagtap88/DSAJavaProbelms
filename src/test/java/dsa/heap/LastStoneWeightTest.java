package dsa.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LastStoneWeightTest {

    @Test
    void smashesUntilOneRemains() {
        assertEquals(1, LastStoneWeight.lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1}));
    }

    @Test
    void equalStonesCancel() {
        assertEquals(0, LastStoneWeight.lastStoneWeight(new int[] {3, 3}));
    }

    @Test
    void singleStone() {
        assertEquals(9, LastStoneWeight.lastStoneWeight(new int[] {9}));
    }
}
