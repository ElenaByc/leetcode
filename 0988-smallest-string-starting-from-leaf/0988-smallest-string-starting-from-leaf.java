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

public class NewTreeNode extends TreeNode {
    String str;
    NewTreeNode(TreeNode node) {
        super(node.val, node.left, node.right);
        this.str = "" + (char)(node.val + 'a');
    }
}
class Solution {
    
    public String smallestFromLeaf(TreeNode root) {
        var level = new LinkedList<NewTreeNode>();
        String smallest = null;
        NewTreeNode node1;
        NewTreeNode node = new NewTreeNode(root);
        level.add(node);
        int n = level.size();
        
        while (n > 0) {
            while (n > 0) {
                node = level.poll();
                if (node.left == null && node.right == null) {
                    // leaf
                    if (smallest == null) {
                        smallest = node.str;
                    } else if (smallest.compareTo(node.str) > 0) {
                        smallest = node.str;
                    }
                } else {
                    if (node.left != null) {
                        node1 = new NewTreeNode(node.left);
                        node1.str += node.str;
                        level.add(node1);
                    }
                    if (node.right != null) {
                        node1 = new NewTreeNode(node.right);
                        node1.str += node.str;
                        level.add(node1);
                    }
                }
                n--;
            }
            n = level.size();
        }
        
        return smallest;
    }
}