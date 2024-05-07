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
    public ListNode doubleIt(ListNode head) {
        int num = 0;
        
        // get length
        int len = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            len++;
        }
        
        if (len == 1 && head.val < 5) {
            head.val *= 2;
            return head;
        } 
        
        // create array
        int[] digits = new int[len];
        node = head;
        int i = 0;
        while (node != null) {
            digits[i] = node.val;
            node = node.next;
            i++;
        }
    
       
        //create new list
        node = null;
        int add = 0;
        int currentDigit;
        for (i = len - 1; i >= 0; i--) {
            currentDigit = digits[i] * 2 + add;
            if (currentDigit < 10) {
                add = 0;
            } else {
                currentDigit %= 10;
                add = 1;
            }
            node = new ListNode(currentDigit, node);
        }
        if (add == 1) {
            node = new ListNode(1, node);
        }

        return node;
    }
}