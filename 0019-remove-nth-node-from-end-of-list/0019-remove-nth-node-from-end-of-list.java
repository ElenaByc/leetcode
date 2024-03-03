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
        // find last node and length
        int len = 1;
        ListNode node = head;
        while (node.next != null) {
            len++;
            node = node.next;
        }

        int last = len - n;
        if (last == 0) {
            return head.next;
        }
        node = head;
        len = 1;
        while (len < last) {
            len++;
            node = node.next;
        }
        ListNode lastNode = node;
        ListNode deleteNode = node.next;
        if (n == 1) {
            lastNode.next = null;
        } else {
            lastNode.next = deleteNode.next; 
        }
        
        return head;
    }
}