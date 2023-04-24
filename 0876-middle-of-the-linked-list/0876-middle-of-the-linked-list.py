# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        n = 0
        node = head
        while node:
            n += 1
            node = node.next
        
        mid = n // 2 + 1
        n = 1
        node = head
        while n < mid:
            n += 1
            node = node.next
        
        return node
        