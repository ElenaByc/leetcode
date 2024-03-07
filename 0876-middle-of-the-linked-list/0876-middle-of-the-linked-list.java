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
    public ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        
        // calculate list's length
        int len = 0;
        ListNode node = head;
        while(node != null) {
            len++;
            node=node.next;
        }
        
        // System.out.println(len);
        int target = len / 2 + 1;
        int cnt = 1;
        node = head;
        while (cnt < target) {
            cnt++;
            node = node.next;
        }
        
        
        return node;
    }
}