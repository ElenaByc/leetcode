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
        if (head == null) return head;
        
        // separate the list into 2 distinct lists and link them afterwards
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);
        ListNode node = head;
        ListNode node1 = head1;
        ListNode node2 = head2;
        
        while (node != null) {
            if (node.val < x) {
                node1.next = node;
                node1 = node1.next;
            } else {
                node2.next = node;
                node2 = node2.next;
            }
            node = node.next;
        }

        node1.next = head2.next; // join lists
        node2.next = null;        
        return head1.next;
    }
}