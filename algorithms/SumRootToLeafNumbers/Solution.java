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
    public int sumNumbers(TreeNode root) {
        return root == null ? 0 : helper(root, 0);
    }
    
    public int helper(TreeNode root, int prefix) {
        int val = prefix * 10 + root.val;
        if (root.left == null && root.right == null)
            return val;
        else
            return (root.left == null ? 0 : helper(root.left, val)) +
                   (root.right == null ? 0 : helper(root.right, val));
    }
}