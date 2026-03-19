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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        q1.offer(p);
        q2.offer(q);
        while(q1.size()!=0 && q2.size()!=0){
            int size=q1.size();
            int size2=q2.size();
            TreeNode cur=q1.poll();
            TreeNode cur2=q2.poll();
            if(cur==null && cur2==null){
                continue;
            }
             if(cur==null || cur2==null){
                   return false;
            }
           if(cur.val!=cur2.val){
            return false;
           }
         
           
                q1.offer(cur.left);
       
                q1.offer(cur.right);
           
         
          
      
                q2.offer(cur2.left);
         
            
                q2.offer(cur2.right);
        
           

        }

        return true;
        
    }
}