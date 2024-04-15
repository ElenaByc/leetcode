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

    public int sumNumbers(TreeNode root) {
        int sum = 0;
        var level = new LinkedList<TreeNode>();
        TreeNode node;
        level.add(root);
        int n = level.size();
        while (n > 0) {
            while (n > 0) {
                node = level.poll();
                n--;
                if (node.left == null && node.right == null) {
                    // leaf 
                    sum += node.val;
                } else { 
                    if (node.left != null) {
                        node.left.val += node.val * 10;
                        level.add(node.left);
                    }
                    if (node.right != null) {
                        node.right.val += node.val * 10;
                        level.add(node.right);
                    }
                }  
            }
            n = level.size();
        }
        
        return sum;
    }
}