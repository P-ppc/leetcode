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
    public TreeNode pruneTree(TreeNode root) {
        root.left = root.left != null ? helper(root.left) : null;
        root.right = root.right != null ? helper(root.right) : null;
        return root;
    }
    
    public TreeNode helper(TreeNode root) {
        root.left = root.left != null ? helper(root.left) : null;
        root.right = root.right != null ? helper(root.right) : null;
        
        return (root.left != null || root.right != null || root.val == 1) ? root : null;
    }
}