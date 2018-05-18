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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<TreeNode> stack = new ArrayList<TreeNode>();
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        
        stack.add(root);
        while (stack.size() > 0) {
            TreeNode node = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            res.add(node.val);
            if (node.right != null) stack.add(node.right);
            if (node.left != null) stack.add(node.left);
        }
        return res;
    }
}