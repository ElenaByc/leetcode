# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
         # separate the list into 2 distinct lists and link them afterwards.
         # p1, p2 traverses the list and hd1 and hd2 are the heads of two lists
            hd1=p1=ListNode(0)
            hd2=p2=ListNode(0)
            while head:
                if head.val<x:
                    p1.next=head
                    p1=p1.next
                else:
                    p2.next=head
                    p2=p2.next
                head=head.next
            #join the lists
            p2.next=None
            p1.next=hd2.next
            return hd1.next