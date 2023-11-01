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
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node;
        int mode = 0;
        if (root != null) {
            queue.offer(root);
        } else {
            return new int[]{};
        }
        while (queue.size() > 0) {
            node = queue.poll();
            hm.put(node.val, hm.getOrDefault(node.val, 0) + 1);
            mode = Math.max(mode, hm.get(node.val));
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int key : hm.keySet()) {
            if (hm.get(key) == mode) {
                list.add(key);
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}