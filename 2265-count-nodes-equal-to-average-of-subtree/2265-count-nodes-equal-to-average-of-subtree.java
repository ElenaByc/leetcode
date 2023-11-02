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
    public int averageOfSubtree(TreeNode root) {
        int[] snc = sumAndNumAndCnt(root);
        int cnt = snc[2];
        return cnt;
    }

    public int[] sumAndNumAndCnt(TreeNode node) {
        int[] sncLeft = new int[3];
        int[] sncRight = new int[3];
        if (node.left != null) {
            sncLeft = sumAndNumAndCnt(node.left);
        }
        if (node.right != null) {
            sncRight = sumAndNumAndCnt(node.right);
        }
        int sum = sncLeft[0] + sncRight[0] + node.val;
        int num = sncLeft[1] + sncRight[1] + 1;
        int cnt = sncLeft[2] + sncRight[2];
        if (node.val == sum / num) {
            cnt++;
        }
        return new int[] {sum, num, cnt};
    }

}