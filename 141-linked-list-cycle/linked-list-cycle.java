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
        ListNode temp = head;
        while (temp != null) {
            if (hash.contains(temp)) {
                return true;
            }
            hash.add(temp);
            temp = temp.next;
        }
        return false;
    }
}
