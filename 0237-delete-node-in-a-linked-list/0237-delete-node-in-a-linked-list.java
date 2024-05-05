/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        while (next.next != null) {
            node.val = next.val;
            node = next;
            next = node.next;
        }
        node.val = next.val;
        node.next = null;
        
    }
}