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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;

        int l = 0;

        while (temp != null) {
            temp = temp.next;
            l++;
        }

        if (n > l) return head;

        if (l == n) {
            head = head.next;
            return head;
        }

        ListNode temp1 = head;
        for (int i = 0; i < l - n - 1; i++) {
            temp1 = temp1.next;
        }

        temp1.next = temp1.next.next;
        
        return head;
    }
}
