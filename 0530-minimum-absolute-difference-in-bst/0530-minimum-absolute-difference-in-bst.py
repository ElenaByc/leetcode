# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def getMinimumDifference(self, root: Optional[TreeNode]) -> int:
        min_val = 100000
        nodes = []
        cur = root
        prev = None 
        while cur or nodes:
            if cur:
                nodes.append(cur)
                cur = cur.left
            else:
                cur = nodes.pop()
                if prev:
                    min_val = min(min_val, cur.val - prev.val)
                prev = cur; 
                cur = cur.right
        return min_val
    