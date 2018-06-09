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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        } else if ((s == null && t != null) || (s != null && t == null)) {
            return false;
        } else if (isSameTree(s, t)) {
            return true;
        } else {
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }
    }
    
    public boolean isSameTree(TreeNode s, TreeNode t) {
        if (s.val == t.val) {
            if (s.left == null && s.right == null && t.left == null && t.right == null) {
                return true;
            } else if (s.left != null && s.right != null && t.left != null && t.right != null) {
                return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
            } else if (s.left != null && s.right == null && t.left != null && t.right == null) {
                return isSameTree(s.left, t.left);
            } else if (s.left == null && s.right != null && t.left == null && t.right != null) {
                return isSameTree(s.right, t.right);
            }
        }
        return false;
    }
}