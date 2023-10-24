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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> maxlist = new ArrayList<>();
        List<TreeNode> nodesList = new ArrayList<>();
        if (root != null) nodesList.add(root);
        largestValues(nodesList, maxlist);
        return maxlist;
    }

    public void largestValues(List<TreeNode> nodesList, List<Integer> maxList) {
        if (nodesList.size() == 0) return;
        int max = Integer.MIN_VALUE;
        List<TreeNode> newNodesList = new ArrayList<>();
        for (TreeNode node : nodesList) {
            if (node != null) {
                max = Math.max(node.val, max);
                if(node.left != null) {
                    newNodesList.add(node.left);
                }
                if(node.right != null) {
                    newNodesList.add(node.right);
                }
            }
        }
        maxList.add(max);
        if(newNodesList.size() == 0) return;
        largestValues(newNodesList, maxList);
    }
}