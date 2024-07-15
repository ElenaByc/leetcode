class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        if (head == null) return head;
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int n : nums) {
            set.add(n);
        }
        
        ListNode h = head;
        while (set.contains(h.val) && h.next != null) {
            h = h.next;
        }

        ListNode prev = h;
        ListNode curr = h.next;
        
        while (curr != null) {
            if (set.contains(curr.val)) {
                // delete it
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        
        return h;
    }
}