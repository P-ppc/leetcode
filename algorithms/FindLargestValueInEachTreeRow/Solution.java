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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>(),
                             nextStack = new LinkedList<TreeNode>();
        
        Integer maxValue = null;
        
        if (root != null) stack.addLast(root);
        while (stack.size() > 0) {
            TreeNode node = stack.pop();
            maxValue = maxValue == null ? node.val : Math.max(maxValue, node.val);
            
            if (node.left != null) nextStack.addLast(node.left);
            if (node.right != null) nextStack.addLast(node.right);
            
            if (stack.size() == 0) {
                res.add(maxValue);
                stack = nextStack;
                nextStack = new LinkedList<TreeNode>();
                maxValue = null;
            }
        }
        
        return res;
    }
}