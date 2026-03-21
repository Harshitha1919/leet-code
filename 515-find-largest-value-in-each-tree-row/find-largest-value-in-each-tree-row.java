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
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
          if (root == null) return arr;  
        q.offer(root);
       
        while(!q.isEmpty()){
              int size=q.size();
            
          
             int max1=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                max1=Math.max(max1,cur.val);
                     
                if(cur.left!=null){
                q.offer(cur.left);
               
                }
                if(cur.right!=null){
                q.offer(cur.right);
           
                }
                

              
            }
            arr.add(max1);

        }
        return arr;
    }
}