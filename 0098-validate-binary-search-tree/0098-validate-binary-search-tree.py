# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    def isValidBSTHelper(self, root: Optional[TreeNode], min_val, max_val) -> bool:
        if root == None:
            return True
    
        if root.val > min_val and root.val < max_val:
            temp1 = self.isValidBSTHelper(root.left, min_val, root.val)
            temp2 = self.isValidBSTHelper(root.right, root.val, max_val)
            return temp1 and temp2

        return False;
            
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        return self.isValidBSTHelper(root, float('-inf'), float('inf'))
