# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

from collections import deque

class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        
        depth = 0
        q = deque()
        q.append([root])
        while q:
            depth += 1
            level = q.popleft()
            next_level = []
            for node in level:
                if not node.left and not node.right: # leaf
                    return depth
                if node.left:
                    next_level.append(node.left)
                if node.right:
                    next_level.append(node.right)
            q.append(next_level)
                
        return depth
                