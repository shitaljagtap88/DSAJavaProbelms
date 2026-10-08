package dsa.linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import dsa.common.ListNode;
import java.util.List;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    @Test
    void reversesMultipleNodes() {
        ListNode reversed = ReverseLinkedList.reverseList(ListNodes.from(1, 2, 3, 4, 5));
        assertEquals(List.of(5, 4, 3, 2, 1), ListNodes.toList(reversed));
    }

    @Test
    void reversesTwoNodes() {
        assertEquals(List.of(2, 1), ListNodes.toList(ReverseLinkedList.reverseList(ListNodes.from(1, 2))));
    }

    @Test
    void emptyList() {
        assertNull(ReverseLinkedList.reverseList(null));
    }
}
