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
    public ListNode partition(ListNode head, int x) {
       ListNode firstHead = null;

        ListNode firstTail = null;

        ListNode secondHead = null;
        ListNode secondTail = null;

        if (head == null){
            return head;
        }


        ListNode curr = head;

        while (curr != null){
            if (curr.val < x){
                if (firstHead == null){
                    firstHead = curr;
                    firstTail = curr;
                }else{
                    firstTail.next = curr;
                    firstTail = firstTail.next;
                }      
            }else{
                if (secondHead == null){
                    secondHead = curr;
                    secondTail = curr;
                }else{
                    secondTail.next = curr;
                    secondTail = secondTail.next;
                }

            }
            curr = curr.next;
        }

        if (secondTail != null){
            secondTail.next = null;
        }
        if (firstTail != null){
            firstTail.next = secondHead;
        }
    
        return firstHead == null ? secondHead: firstHead;
        
    }

}