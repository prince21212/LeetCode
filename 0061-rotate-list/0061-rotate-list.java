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
     public int size(ListNode head) {
        int s = 0;
        while (head != null) {
            s++;
            head = head.next;
        }
        return s;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        
        int s = size(head);
        k %= s;
        if (k == 0) return head;
        
        int go = s - k - 1;
        ListNode temp = head;
        for (int i = 0; i < go; i++) {
            temp = temp.next;
        }
        
        ListNode start = temp.next;
        temp.next = null;
        
        temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        
        temp.next = head;
        
        return start;
        
    }
}