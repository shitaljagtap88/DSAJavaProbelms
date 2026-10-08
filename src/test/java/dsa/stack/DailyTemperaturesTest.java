package dsa.stack;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class DailyTemperaturesTest {

    @Test
    void classicExample() {
        assertArrayEquals(
                new int[] {1, 1, 4, 2, 1, 1, 0, 0},
                DailyTemperatures.dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73}));
    }

    @Test
    void strictlyDecreasingNeverWarms() {
        assertArrayEquals(new int[] {0, 0, 0}, DailyTemperatures.dailyTemperatures(new int[] {30, 20, 10}));
    }

    @Test
    void singleDay() {
        assertArrayEquals(new int[] {0}, DailyTemperatures.dailyTemperatures(new int[] {90}));
    }
}
