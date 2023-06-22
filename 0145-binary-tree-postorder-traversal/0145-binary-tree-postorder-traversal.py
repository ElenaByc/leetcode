# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        result = []
        to_visit = [root]
        while to_visit:
            node = to_visit.pop()
            if node:
                result.append(node.val)
                to_visit.append(node.left)
                to_visit.append(node.right)
        return result[::-1]