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
        ListNode first, node;
        first = head.next;
        head = head.next;
        node = first;
        int sum = 0;
        while(node != null) {
            if(node.val != 0) {
                sum += node.val;
            } else {
                first.val = sum;
                first.next = node.next;
                sum = 0;
                first = node.next;
            }
            node = node.next;
        }
         
        return head;
    }
}