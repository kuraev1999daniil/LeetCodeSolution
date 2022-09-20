package easy.p206_reverse_linked_list;

import base.ListNode;

import java.util.Stack;

public class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        Stack<Integer> values = new Stack<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }


        ListNode result = new ListNode();
        ListNode current = result;

        while (!values.empty()) {
            current.val = values.pop();
            if (!values.empty()) {
                current.next = new ListNode();
            }
            current = current.next;
        }

        return result;
    }
}
