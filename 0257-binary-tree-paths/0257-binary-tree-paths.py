# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        if not root:
            return []
        if not root.left and not root.right:
            return [str(root.val)]
        
        result = []
        start_str = str(root.val) + "->"
        result_left = self.binaryTreePaths(root.left)
        result_right = self.binaryTreePaths(root.right)
        for s in result_left:
            result.append(start_str + s)
        for s in result_right:
            result.append(start_str + s)
        return result
        