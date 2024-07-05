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
    public ListNode mergeNodes(ListNode head) {
        ListNode node = head.next;
        ListNode temp = node;
        
        while(temp != null){
            //find the sum for a block 
            int sum = 0; // bcz eact time for a new block we start the sum from 0
            
            while(temp.val != 0){
                sum += temp.val;
                temp = temp.next;
            } 
            // update the value of node when the next 0 is found in list
            node.val = sum;
            
            //now move temp to the next block
            temp = temp.next;
            
           //its time to connect the next block 
            node.next = temp;
            
            //move node to the next block
            node = temp;
            
        }
        //now skip the head of the linked list and make the node as head 
        head = head.next;
        
        return head;
    }
}