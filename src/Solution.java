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

