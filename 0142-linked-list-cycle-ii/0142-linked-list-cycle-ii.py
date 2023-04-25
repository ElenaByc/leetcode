# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None or head.next == None:
            return None
    
        slow = head
        fast = head
        x = True
        while ((fast and fast.next and fast != slow) or x):
            slow = slow.next
            fast = fast.next.next
            x = False
            if fast == None or fast.next == None:
                return None
            
        
        slow = head
        while slow != fast: 
            slow = slow.next;
            fast = fast.next
    
        return slow

        