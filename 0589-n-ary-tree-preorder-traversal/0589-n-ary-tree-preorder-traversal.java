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
    public List<Integer> preorder(Node root) {
        
        
        ArrayList<Integer> preorder=new  ArrayList<Integer>();
        preorderT(root,preorder);
        return preorder;
    }
    
    public void  preorderT( Node root,ArrayList<Integer> preorder){
        
        
        if(root==null)
            return;
            
        preorder.add(root.val);
        for(Node child: root.children)
           preorderT(child,preorder);

    }
}
    
