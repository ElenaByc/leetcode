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
    public int findSecondMinimumValue(TreeNode root) {
        int smallest = root.val;
        int second = Integer.MAX_VALUE;
        boolean found = false;
        TreeNode node;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (q.size() > 0) {
            node = q.poll();
            if (node.val != smallest && node.val <= second) {
                found = true;
                second = node.val;
            }
            if (node.left != null) {
                q.offer(node.left);
            }
            if (node.right != null) {
                q.offer(node.right);
            }
        }
        
        if (found) {
            return second;
        }
        return -1;
    }
}