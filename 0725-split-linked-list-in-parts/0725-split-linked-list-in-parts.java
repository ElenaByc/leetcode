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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode node;
        
        node = head;
        while(node != null) {
            n++;
            node = node.next;
        }
        
        int numOfElem = n / k;
        int rem = n % k;
        node = head;
        ListNode[] result = new ListNode[k];
        ListNode prev = null;
        node = head;
        for (int i = 0; node != null && i < k; i++, rem--) {
            result[i] = node;
            for (int j = 0; j < numOfElem + (rem > 0? 1 : 0); j++) {
                prev = node;
                node = node.next;
            }
            prev.next = null; //last element if part
        }
            
        return result;
    }
}