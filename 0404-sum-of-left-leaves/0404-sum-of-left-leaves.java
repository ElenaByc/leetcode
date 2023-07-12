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
        if (root == null) {
            return 0;
        }
        
        int sum = 0;
        ArrayList<TreeNode> level = new ArrayList<>();
        level.add(root);
        
        ArrayList<TreeNode> nextLevel = new ArrayList<>();
        TreeNode left, right;
        
        while (level.size() > 0) {
            for (TreeNode node : level) {
                left = node.left;
                if (left != null) {
                    if (left.left == null && left.right == null) { //leaf
                        sum += left.val;
                    } else {
                        nextLevel.add(left);
                    }
                }
                right = node.right;
                if (right != null) {
                    nextLevel.add(right);
                }
            }
            level.clear();
            for(TreeNode node: nextLevel) level.add(node);
            nextLevel.clear();
        }
        return sum;
    }
}