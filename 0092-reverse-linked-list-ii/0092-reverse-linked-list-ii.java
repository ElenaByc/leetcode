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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null) return null;
        
        ListNode node0 = new ListNode(0); 
        node0.next = head;
        
        ListNode pre = node0; // make a pointer pre as a marker for the node before reversing
        for (int i = 0; i < left-1; i++) {
            pre = pre.next;
        }
        // pre is (left-1)th node

        ListNode start = pre.next; // a pointer to the beginning of a sub-list that will be reversed
        ListNode then = start.next; // a pointer to a node that will be reversed

        for (int i = 0; i < right - left; i++) {
            // insert then after pre
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }

        return node0.next;
    }
}