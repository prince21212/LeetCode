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
    public ListNode doubleIt(ListNode head) {
        ListNode cr = head;
        ListNode pv = null;

        while (cr != null) {
            int twiceOfValue = cr.val * 2;

            if (twiceOfValue < 10) {
                cr.val = twiceOfValue;
            } else if (pv != null) {
                cr.val = twiceOfValue % 10;
                pv.val = pv.val + 1;
            } else {
                head = new ListNode(1, cr);
                cr.val = twiceOfValue % 10;
            }

            pv = cr;
            cr = cr.next;
        }
        return head;
    }
}