package easy.p876_middle_of_the_linked_list;

import base.ListNode;

/**
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/">876. Middle of the Linked List</a>
 */
public class Solution {

    public ListNode middleNode(ListNode head) {
        if (head.next == null) return head;

        boolean hasNextMiddleValue = false;
        ListNode middleValue = head;
        while (head != null) {
            if (hasNextMiddleValue) {
                middleValue = middleValue.next;
            }

            hasNextMiddleValue = !hasNextMiddleValue;

            head = head.next;
        }

        return middleValue;
    }
}

