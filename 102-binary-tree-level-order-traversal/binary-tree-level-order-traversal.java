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
        List<List<Integer>> arr=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return arr;
        }
        q.offer(root);
        while(q.size()!=0){
            int size=q.size();
            ArrayList<Integer> arr1=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                arr1.add(cur.val);
                if(cur.left!=null)
            q.offer(cur.left);
            if(cur.right!=null)
            q.offer(cur.right);
            }
            arr.add(arr1);
        }
        return arr;
    }
}