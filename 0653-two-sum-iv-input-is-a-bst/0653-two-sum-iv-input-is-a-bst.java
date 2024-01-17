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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> inorder = new ArrayList<>();
        getAllValues(inorder, root);     
        int left = 0;
        int right = inorder.size() - 1;
        int sum;
        while (left < right) {
            sum = inorder.get(left) + inorder.get(right);
            if (sum == k) {
                return true;
            } else if (sum > k) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
    
    public void getAllValues(List inorder, TreeNode node) {
        if (node == null) {
            return;
        }
        getAllValues(inorder, node.left);
        inorder.add(node.val);
        getAllValues(inorder, node.right);
    }
}
