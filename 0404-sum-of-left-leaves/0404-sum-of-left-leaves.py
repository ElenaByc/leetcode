# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        
        sum = 0
        level = [root]
        next_level = []
        
        while level:
            for node in level:
                left = node.left
                if left:
                    if not left.left and not left.right: # leaf
                        sum += left.val
                    else:
                        next_level.append(left)
                right = node.right
                if right:
                    next_level.append(right)
            level = next_level
            next_level = []
        
        return sum
                    
                    
                            
                    
        