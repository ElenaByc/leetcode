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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode node = head;
        List<Integer> list = new ArrayList<>();
        
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        
        int n = list.size();
        
        for (int i = 0; i < n /2; i++) {
            if (list.get(i) != list.get(n - 1 - i)) {
                return false;
            }
        }
        
        return true;
        
    }
}