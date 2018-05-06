/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        } else if (t2 == null) {
            return t1;
        }
        
        TreeNode tree = new TreeNode(t1.val + t2.val);
        tree.left = mergeTrees(t1.left, t2.left);
        tree.right = mergeTrees(t1.right, t2.right);
        return tree;
    }
}