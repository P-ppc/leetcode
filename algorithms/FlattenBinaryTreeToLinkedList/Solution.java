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
    public void flatten(TreeNode root) {
        LinkedList<TreeNode> rights = new LinkedList<TreeNode>();
        
        while (root != null) {
            if (root.left != null && root.right != null) {
                rights.addFirst(root.right);
            }
            
            if (root.left != null) {
                root.right = root.left;
                root.left = null;
            } else if (root.right == null && rights.size() > 0) {
                root.right = rights.removeFirst();
            }
            root = root.right;
        }
    }
}