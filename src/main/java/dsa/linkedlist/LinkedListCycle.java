package dsa.linkedlist;

import dsa.common.ListNode;

/**
 * Linked List Cycle (easy).
 *
 * <p>Return {@code true} if the linked list contains a cycle (a node's {@code next} points back to
 * a previous node), otherwise {@code false}.
 *
 * <p>Time: O(n).<br>
 * Space: O(1) — Floyd's tortoise and hare, no visited set.
 */
public final class LinkedListCycle {
    private LinkedListCycle() {}

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
