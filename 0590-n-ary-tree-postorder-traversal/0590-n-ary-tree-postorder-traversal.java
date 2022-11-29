/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
  //  ArrayList<Integer> ans=new ArrayList<>();
    public List<Integer> postorder(Node root) {
          ArrayList<Integer> ans=new ArrayList<>();
          postorderhelper(root,ans);
           
         return ans;   
            
    }
    public void postorderhelper(Node root,ArrayList<Integer> ans){
    
        if(root==null)
            return;
        
     //postorder(root.left);
        //postorder(root.right);
        for(Node child:root.children)
            postorderhelper(child,ans);
        ans.add(root.val);
    }
}