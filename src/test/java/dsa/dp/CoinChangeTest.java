package dsa.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CoinChangeTest {

    @Test
    void fewestCoins() {
        assertEquals(3, CoinChange.coinChange(new int[] {1, 2, 5}, 11));
    }

    @Test
    void impossible() {
        assertEquals(-1, CoinChange.coinChange(new int[] {2}, 3));
    }

    @Test
    void zeroAmount() {
        assertEquals(0, CoinChange.coinChange(new int[] {1}, 0));
    }

    @Test
    void singleCoinEqualsAmount() {
        assertEquals(1, CoinChange.coinChange(new int[] {1, 3, 4}, 4));
    }
}
