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
   public boolean isBalanced(TreeNode root) {
        return dfsheight(root) != -1;
    }
    
    int dfsheight(TreeNode root){
        
        if(root==null)
            return 0;
        
        int lp=dfsheight(root.left);
        if(lp==-1) return -1;
        int rp=dfsheight(root.right);
        if(rp==-1) return -1;
        
        if(Math.abs(lp-rp)>1) return -1;
        return 1+Math.max(lp,rp);
    }
}