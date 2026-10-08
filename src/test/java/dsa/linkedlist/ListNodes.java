package dsa.linkedlist;

import dsa.common.ListNode;
import java.util.ArrayList;
import java.util.List;

final class ListNodes {
    private ListNodes() {}

    static ListNode from(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int value : values) {
            tail.next = new ListNode(value);
            tail = tail.next;
        }
        return dummy.next;
    }

    static List<Integer> toList(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode curr = head;
        int guard = 0;
        while (curr != null) {
            if (++guard > 10_000) {
                throw new IllegalStateException("Possible cycle while converting list");
            }
            values.add(curr.val);
            curr = curr.next;
        }
        return values;
    }
}
