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
    public List<Integer> rightSideView(TreeNode root) {
         ArrayList<Integer> arr=new ArrayList<>();

        if(root==null){
            return arr;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            arr.add(q.peek().val);
            for(int i=0;i<size;i++){
               TreeNode cur=q.poll();
               if(cur.right!=null){
                q.add(cur.right);
               }
               if(cur.left!=null){
                q.add(cur.left);
               }
            }
        }
        return arr;

       
    }
}