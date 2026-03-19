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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> q1 = new LinkedList<>();

        q.offer(root.left);
        q1.offer(root.right);

        while (!q.isEmpty() && !q1.isEmpty()) {
            TreeNode cur = q.poll();
            TreeNode cur2 = q1.poll();

            if (cur == null && cur2 == null) continue;

            if (cur == null || cur2 == null) return false;

            if (cur.val != cur2.val) return false;

            // 🔥 mirror insertion
            q.offer(cur.left);
            q.offer(cur.right);

            q1.offer(cur2.right);
            q1.offer(cur2.left);
        }

        return true;
    }
}