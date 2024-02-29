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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> currentLevel = new LinkedList<>();
        Queue<TreeNode> nextLevel = new LinkedList<>();
        int level = 0;
        currentLevel.add(root);
        TreeNode node;
        int prevVal;
        
        while(currentLevel.size() > 0) {
            // System.out.println("level = " + level);
            if (level % 2 == 0 ) {
                prevVal = 0;
            } else {
                prevVal = 1000001;
            }
            
            while(currentLevel.size() > 0) {
                node = currentLevel.poll();
                if (node.val % 2 == level % 2) {
                    return false;
                } 
                if (level % 2 == 0 && node.val <= prevVal) {
                    return false;
                }
                if (level % 2 == 1 && node.val >= prevVal) {
                    return false;
                }
                prevVal = node.val;
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }
            }
            while(nextLevel.size() > 0) {
                currentLevel.add(nextLevel.poll());
            }
            level++;
            
        }
        
        return true;
    }
}