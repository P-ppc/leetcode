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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<TreeNode> stack = new ArrayList<TreeNode>(),
                       nextStack = new ArrayList<TreeNode>();
        List<Integer> values = new ArrayList<Integer>();
        
        if (root != null) stack.add(root);
        
        while (stack.size() > 0) {
            TreeNode node = stack.get(0);
            stack.remove(0);
            values.add(node.val);
            
            if (node.left != null) nextStack.add(node.left);
            if (node.right != null) nextStack.add(node.right);
            
            if (stack.size() == 0) {
                res.add(values);
                stack = nextStack;
                values = new ArrayList<Integer>();
                nextStack = new ArrayList<TreeNode>();
            }
        }
        
        return res;
    }
}