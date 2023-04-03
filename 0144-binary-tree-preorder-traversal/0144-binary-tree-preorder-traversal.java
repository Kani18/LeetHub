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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        
        ArrayList<Integer> preorder=new  ArrayList<Integer>();
        preorderT(root,preorder);
        return preorder;
    }
    
    public void  preorderT( TreeNode root,ArrayList<Integer> preorder){
        
        
        if(root==null)
            return;
            
        preorder.add(root.val);
        preorderT(root.left,preorder);
        preorderT(root.right,preorder);
    }
}