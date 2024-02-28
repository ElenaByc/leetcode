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
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(list, root);
        
        int minDiff = Integer.MAX_VALUE;
        // System.out.println(list);
        
        for (int i = 1; i < list.size(); i++) {
            minDiff = Math.min(list.get(i) - list.get(i-1), minDiff);
            if (minDiff == 0) {
                break;
            }
        }
        
        return minDiff;
    }
    
    public void inOrder(List<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(list, node.left);
        list.add(node.val);
        inOrder(list, node.right);
    }
}