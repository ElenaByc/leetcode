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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root.val == x || root.val == y) {
            return false;
        }
         
        Queue<TreeNode> level = new LinkedList<>();
        Queue<TreeNode> parents = new LinkedList<>();
        TreeNode node;
        TreeNode nodeX = null;
        TreeNode nodeY = null;
        TreeNode parentX = null;
        TreeNode parentY = null;
        
        level.offer(root);
        parents.offer(null);
        int n = level.size();
        while (n > 0) {
            for (int i = 0; i < n; i++) {
                node = level.poll();
                if (node.val == x) {
                    nodeX = node;
                    parentX = parents.poll();
                } else if (node.val == y) {
                    nodeY = node;
                    parentY = parents.poll();
                } else {
                    parents.poll();
                }
                
                if (node.left != null) {
                    level.offer(node.left);
                    parents.offer(node);
                }
                if (node.right != null) {
                    level.offer(node.right);
                    parents.offer(node);
                }
            }
            if (nodeX != null && nodeY != null) {
                if (parentY == parentX) {
                    return false;
                } else {
                    return true;
                }
            } else if (nodeX != null || nodeY != null) {
                return  false;
            }
            n = level.size();
        }
        
        return false;
    }
}