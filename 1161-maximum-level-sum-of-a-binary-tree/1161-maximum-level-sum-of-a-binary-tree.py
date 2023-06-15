# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        max_sum = root.val
        result_level = 1
        level = 1
        curr_level = [root]
        while curr_level:
            next_level = []
            curr_sum = 0
            for node in curr_level:
                curr_sum += node.val
                if node.left:
                    next_level.append(node.left)
                if node.right:
                    next_level. append(node.right)
            if curr_sum > max_sum:
                max_sum = curr_sum
                result_level = level
            level += 1
            curr_level = next_level
            
        return result_level

        
        