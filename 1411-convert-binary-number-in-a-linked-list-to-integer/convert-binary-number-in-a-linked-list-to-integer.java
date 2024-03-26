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

    public int getDecimalValue(ListNode head) {
        // String r = "";
        // while(head != null){
        //     r = r + head.val;
        //     head = head.next;
        // }
        // return Integer.parseInt(r,2);

        // int r = head.val;
        // while(head.next != null){
        //     // r = r * 2 + head.next.val;
        //     r = (r << 1) | head.next.val;
        //     head = head.next;
        // }
        // return r;

        // 9 - 1001
        // 5 - 101
        // 1 * 2 * 2 + 0 * 2 + 1 * 1
        int result = 0;
        while (head != null) {
            // result = result << 1;
            result = result * 2;
            System.out.print(result);
            result = result + head.val;
            System.out.println(result);
            head = head.next;
        }
        return result;
    }
}
