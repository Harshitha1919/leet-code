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
    public void traverse(Node root,List<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.val);
        for(Node child:root.children){
            
            traverse(child,arr);
        }
    }
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> arr=new ArrayList<>();
        traverse(root,arr);
        return arr;
    }
}