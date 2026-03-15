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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> arr=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(q.size()!=0){
             double sum=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
               sum=sum+cur.val;
                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }
            }
            Double avg=sum/size;
            arr.add(avg);
        }
        return arr;
    }
}