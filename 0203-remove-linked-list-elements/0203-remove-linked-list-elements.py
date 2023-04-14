# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        while head != None and head.val == val:
            head = head.next
        if head == None:
            return head
        prev = head
        node = prev.next
        while node != None:
            if node.val == val:
                prev.next = node.next
            else:
                prev = node
            node = node.next
        
        return head