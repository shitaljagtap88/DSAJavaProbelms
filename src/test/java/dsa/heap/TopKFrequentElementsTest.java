package dsa.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class TopKFrequentElementsTest {

    @Test
    void topTwo() {
        int[] result = TopKFrequentElements.topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2);
        assertEquals(setOf(1, 2), setOf(result));
    }

    @Test
    void kEqualsOne() {
        int[] result = TopKFrequentElements.topKFrequent(new int[] {1}, 1);
        assertEquals(setOf(1), setOf(result));
    }

    @Test
    void negativesAndTiesOnFrequencyStillReturnsK() {
        int[] result = TopKFrequentElements.topKFrequent(new int[] {-1, -1, 2, 2, 3}, 2);
        assertEquals(2, result.length);
        assertEquals(setOf(-1, 2), setOf(result));
    }

    private static java.util.Set<Integer> setOf(int... values) {
        return Arrays.stream(values).boxed().collect(Collectors.toSet());
    }
}
