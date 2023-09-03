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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> levelValues;  // list to store current level
        if (root == null) return res;
        
        if (root.left == null && root.right == null) {
            levelValues = new ArrayList<>();
            levelValues.add(root.val);
            res.add(levelValues);
            return res;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node;
        int n;
        queue.add(root); 
        while (!queue.isEmpty()) {
            n = queue.size();
            levelValues = new ArrayList<>();
            while (n > 0) {
                node = queue.poll(); 
                levelValues.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                     queue.add(node.right);
                }
                n--;
            }
            res.add(levelValues);
        }
        return res;
    }
}