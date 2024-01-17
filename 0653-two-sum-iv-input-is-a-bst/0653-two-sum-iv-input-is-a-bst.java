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
        Set<Integer> set = new HashSet<>();
        return twoSum(set, root, k);     
    }
    
    public boolean twoSum(Set set, TreeNode node, int k) {
        if (node == null) {
            return false;
        }
        int num = k - node.val;
        
        if (set.contains(num)) {
            return true;
        }
        set.add(node.val);
        // System.out.println(set);
        return twoSum(set, node.left, k) || twoSum(set, node.right, k);
    }
}
