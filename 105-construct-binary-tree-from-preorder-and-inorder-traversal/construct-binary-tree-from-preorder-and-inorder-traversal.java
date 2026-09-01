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
    public TreeNode build(int [] preorder,int preStart,int preEnd,int[] inorder ,int inStart,int inEnd,Map<Integer,Integer> hs){
      if(preStart>preEnd || inStart>inEnd){
           return null;
      }
    int nroot = hs.get(preorder[preStart]);
      int totalnode=nroot-inStart;
      TreeNode newNode=new TreeNode(preorder[preStart]);

      newNode.left=build(preorder,preStart+1,preStart+totalnode,inorder,inStart,nroot-1,hs);
       newNode.right=build(preorder,preStart+totalnode+1,preEnd,inorder,nroot+1,inEnd,hs);
      
         return newNode;



    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hs.put(inorder[i],i);
        }
     return   build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,hs);
      


    }
}