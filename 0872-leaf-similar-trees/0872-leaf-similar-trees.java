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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
         List<Integer> list1 =  getLeavesList(root1);
         List<Integer> list2 =  getLeavesList(root2);
        
        int size1 = list1.size();
        int size2 = list2.size();
        
        if (size1 != size2) return false;
        
        // System.out.println(list1);
        // System.out.println(list2);

        for (int i = 0; i < size1; i++) {
            if (list1.get(i) != list2.get(i)) {
                return false;
            }
        }
        
        return true;
        
    }
    
    public List getLeavesList(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getLeavesList(root, list);
        return list;
    }

    public void getLeavesList(TreeNode node, List list) {
        if (node.left == null && node.right == null) {
            // leaf
            list.add(node.val);
        } else {
            if (node.left != null) {
                getLeavesList(node.left, list);
            }
            if (node.right != null) {
                getLeavesList(node.right, list);
            }
        }
    }

}