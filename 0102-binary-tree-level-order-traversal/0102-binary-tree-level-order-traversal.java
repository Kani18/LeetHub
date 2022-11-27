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
        
        List<List<Integer>> store=new ArrayList<List<Integer>>();
        if(root==null) return store;
            
            
            
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        
        while(!q.isEmpty()){
            int qlen=q.size();
            ArrayList<Integer> sublist=new  ArrayList<Integer>();
            for(int i=0;i<qlen;i++){
                TreeNode node=q.poll();
                sublist.add(node.val);
                if(node.left !=null) q.add(node.left);
                if(node.right !=null) q.add(node.right);
            }
            
            store.add(sublist);
        }
        return store;
    }
}