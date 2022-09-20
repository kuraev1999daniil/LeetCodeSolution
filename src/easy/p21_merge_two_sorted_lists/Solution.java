package easy.p21_merge_two_sorted_lists;

import base.ListNode;

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        while (l1 != null && l2 != null) {
            int x = l1.val;
            int y = l2.val;

            if (x >= y) {
                current.val = y;
                l2 = l2.next;
            } else {
                current.val = x;
                l1 = l1.next;
            }

            current.next = new ListNode();
            current = current.next;
        }

        while (l1 != null) {
            current.val = l1.val;
            l1 = l1.next;
            if (l1 != null) {
                current.next = new ListNode();
                current = current.next;
            }
        }

        while (l2 != null) {
            current.val = l2.val;
            l2 = l2.next;
            if (l2 != null) {
                current.next = new ListNode();
                current = current.next;
            }
        }

        return dummyHead;
    }
}
