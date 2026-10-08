package dsa.linkedlist;

import dsa.common.ListNode;

/**
 * Reverse Linked List (easy).
 *
 * <p>Reverse a singly linked list and return the new head.
 *
 * <p>Time: O(n).<br>
 * Space: O(1) — iterative pointer reversal, no recursion.
 */
public final class ReverseLinkedList {
    private ReverseLinkedList() {}

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
