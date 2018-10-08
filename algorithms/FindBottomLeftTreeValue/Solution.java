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
    public int findBottomLeftValue(TreeNode root) {
        int val = -1;
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>(),
                             nextStack = new LinkedList<TreeNode>();
        
        stack.add(root);
        
        while (stack.size() > 0) {
            TreeNode node = stack.poll();
            if (node.right != null)
                nextStack.add(node.right);
            if (node.left != null)
                nextStack.add(node.left);
            
            
            if (stack.size() == 0) {
                val = node.val;
                stack = nextStack;
                nextStack = new LinkedList<TreeNode>();
            }
        }
        
        return val;
    }
}