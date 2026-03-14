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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> arr=new ArrayList<>();
        if(root ==null){
            return arr;
        }
     Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(q.size()!=0){
           int size1=q.size();
              List<Integer> arr1=new ArrayList<>();
              for(int i=0;i<size1;i++){
                Node curr=q.poll();
                arr1.add(curr.val);
              
            
            for(Node child:curr.children){
             q.offer(child);
              
            }
              }
            arr.add(arr1);
           
        }
      
        return arr;
    }
}