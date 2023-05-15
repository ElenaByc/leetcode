# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapNodes(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        node = head
        index = 0
        while (node != None):
            index += 1
            if index == k:
                value1 = node.val
            node = node.next
        
        list_len = index
        l = list_len - k + 1
        print(l)
        if l == k:
            return head
        
        index = 0
        node = head
        while index < max(l, k):
            index += 1
            if index == l:
                value2 = node.val
                node.val = value1
                break
            node = node.next
            
        index = 0
        node = head
        while index < max(l, k):
            index += 1
            if index == k:
                node.val = value2
                return head
            node = node.next
        
        return head

    
            
        