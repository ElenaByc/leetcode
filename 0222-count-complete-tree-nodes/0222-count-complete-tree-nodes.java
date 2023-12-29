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
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode node;
        int cnt = 0;
        
        while(queue.size() > 0) {
            node = queue.remove();
            cnt++;
            if (node.left != null) {
                 queue.offer(node.left);
            }
            if (node.right != null) {
                 queue.offer(node.right);
            }
        }
        
        return cnt;
    }
}