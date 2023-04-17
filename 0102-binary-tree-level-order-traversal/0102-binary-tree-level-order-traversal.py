# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root == None:
            return []
        if (root.left == None and root.right == None):
            return [[root.val]]
        arr = []   # queue
        arr2 = []  # temp array to store level
        res = []
        arr.append(root)
        while len(arr) > 0:
            len_arr = len(arr)
            arr2 = []
            while len_arr > 0:
                node = arr.pop(0)
                arr2.append(node.val)
                if node.left != None:
                    arr.append(node.left)
                if node.right != None:
                    arr.append(node.right)
                len_arr -= 1
            res.append(arr2)
        return res
