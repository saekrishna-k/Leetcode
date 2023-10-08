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
    public ListNode middleNode(ListNode head) {
        // ListNode temp = head;
        // int size = 0;
        // while(temp.next != null){
        //     temp = temp.next;
        //     size++;
        // }
        // size++;
        // int mid = (size/2) + 1;
        // int i = 1;
        // ListNode r = head;
        // while(r != null && i < mid){
        //     r = r.next;
        //     i++;
        // }
        // return r;
        
        // ListNode[] A = new ListNode[100];
        // int t = 0;
        // while (head != null) {
        //     A[t++] = head;
        //     head = head.next;
        // }
        // return A[t / 2];
        
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}