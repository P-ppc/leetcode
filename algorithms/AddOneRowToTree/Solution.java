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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }

        int depth = 1;
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>(),
                             nextStack = new LinkedList<TreeNode>();
        stack.push(root);

        while (depth < d - 1) {
            TreeNode node = stack.pop();
            if (node.left != null)
                nextStack.push(node.left);
            if (node.right != null)
                nextStack.push(node.right);
            if (stack.size() == 0) {
                stack = nextStack;
                nextStack = new LinkedList<TreeNode>();
                depth++;
            }
        }

        while (stack.size() > 0) {
            TreeNode node = stack.pop(),
                left = new TreeNode(v),
                right = new TreeNode(v);
            left.left = node.left;
            node.left = left;
            right.right = node.right;
            node.right = right;
        }

        return root;
    }
}