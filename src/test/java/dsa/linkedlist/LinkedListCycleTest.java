package dsa.linkedlist;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import dsa.common.ListNode;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

    @Test
    void detectsCycleToEarlierNode() {
        ListNode head = ListNodes.from(3, 2, 0, -4);
        ListNode pos = head.next;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = pos;
        assertTrue(LinkedListCycle.hasCycle(head));
    }

    @Test
    void noCycle() {
        assertFalse(LinkedListCycle.hasCycle(ListNodes.from(1, 2, 3)));
    }

    @Test
    void singleNodeNoCycle() {
        assertFalse(LinkedListCycle.hasCycle(new ListNode(1)));
    }

    @Test
    void selfLoop() {
        ListNode node = new ListNode(1);
        node.next = node;
        assertTrue(LinkedListCycle.hasCycle(node));
    }
}
