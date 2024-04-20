/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public boolean isPalindrome(ListNode head) {
        // ListNode fast = head, slow = head;
        // while (fast != null && fast.next != null) {
        //     fast = fast.next.next;
        //     slow = slow.next;
        // }
        // slow = reverse(slow);
        // fast = head;
        // while (slow != null) {
        //     if (fast.val != slow.val) {
        //         return false;
        //     }
        //     fast = fast.next;
        //     slow = slow.next;
        // }
        // return true;

        if (head == null || head.next == null) {
            return true;
        }

        ListNode h = head;
        int[] val = new int[100_000];
        int size = 0;

        while (h != null) {
            val[size++] = h.val;
            h = h.next;
        }

        int m = size / 2;
        for (int i = 0; i < m; i++) {
            if (val[i] != val[--size]) {
                return false;
            }
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
