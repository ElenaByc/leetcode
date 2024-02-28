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
        // get all values into list 
        // sort them 
        // find diff
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int minDiff = Integer.MAX_VALUE;
        q.offer(root);
        TreeNode node;
        while(q.size() > 0) {
            node = q.poll();
            list.add(node.val);
            if(node.left != null) {
                q.offer(node.left);
            }
            if(node.right != null) {
                q.offer(node.right);
            }
        }
        Collections.sort(list);  
        // System.out.println(list);
        
        for (int i = 1; i < list.size(); i++) {
            minDiff = Math.min(list.get(i) - list.get(i-1), minDiff);
            if (minDiff == 0) {
                break;
            }
        }
        
        
        return minDiff;
    }
}