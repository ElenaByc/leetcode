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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        
        int size;
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node;
        queue.add(root);
        while (queue.size() > 0) {
            depth++;
            size = queue.size();
            for (int i = 0; i < size; i++) {
                node = queue.remove();
                if (node.left == null && node.right == null) return depth; // leaf
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }        
        return depth;
    }
}