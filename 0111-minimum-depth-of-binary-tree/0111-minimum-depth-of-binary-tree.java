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
    public int minDepth(TreeNode root) {
         if(root==null)
        return 0;

        int lp=minDepth(root.left);
        int rp=minDepth(root.right);
        return (lp==0 || rp==0) ? 1+rp+lp :  1+Math.min(lp,rp);
    }
}