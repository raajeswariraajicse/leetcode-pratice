class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int len = 1;

        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        k = k % len;

        if (k == 0) {
            return head;
        }

        temp.next = head;

        int steps = len - k;
        ListNode newTail = temp;

        while (steps > 0) {
            newTail = newTail.next;
            steps--;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}