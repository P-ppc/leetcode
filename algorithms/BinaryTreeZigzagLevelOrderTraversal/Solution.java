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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<List<Integer>>();
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> values = new ArrayList<Integer>();
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>(),
                             nextStack = new LinkedList<TreeNode>();
        int direction = 1;
        stack.add(root);
        
        while (stack.size() > 0) {
            TreeNode node = stack.poll();
            if (direction == 1)
                values.add(node.val);
            else
                values.add(0, node.val);
            
            if (node.left != null)
                nextStack.add(node.left);
            if (node.right != null)
                nextStack.add(node.right);
            
            if (stack.size() == 0) {
                direction = direction == 1 ? 0 : 1;
                res.add(values);
                values = new ArrayList<Integer>();
                stack = nextStack;
                nextStack = new LinkedList<TreeNode>();
            }
        }
        
        return res;
    }
}