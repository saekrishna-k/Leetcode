/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public boolean hasCycle(ListNode head) {
        // ListNode slow = head, fast = head;
        // while (fast != null && fast.next != null) {
        //     fast = fast.next.next;
        //     slow = slow.next;
        //     if (fast == slow) return true;
        // }
        // return false;

        Set<ListNode> hash = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (!hash.add(current)) return true;
            current = current.next;
        }
        return false;
    }
}
