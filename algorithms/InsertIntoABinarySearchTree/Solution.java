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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        
        TreeNode p = root,
                 pre = null;
        
        while (p != null) {
            pre = p;
            if (val < p.val)
                p = p.left;
            else
                p = p.right;
        }
        
        if (val < pre.val)
            pre.left = new TreeNode(val);
        else
            pre.right = new TreeNode(val);

        return root;
    }
}