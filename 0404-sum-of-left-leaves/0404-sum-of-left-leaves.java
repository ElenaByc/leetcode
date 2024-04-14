/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root, false);    
    }
    
    public int helper(TreeNode node, boolean isLeft) {
        if (node.left == null && node.right == null) {
            // leaf
            return isLeft? node.val : 0;
        }
        if (node.left == null) {
            return helper(node.right, false);
        }
        if (node.right == null) {
            return helper(node.left, true);
        }
        return helper(node.left, true) + helper(node.right, false); 
    }
    
    
}