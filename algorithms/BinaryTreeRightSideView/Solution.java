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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>(),
                             nextStack = new LinkedList<TreeNode>();
        LinkedList<Integer> values = new LinkedList<Integer>();
        
        if (root != null) stack.addFirst(root);
        
        while (stack.size() > 0) {
            TreeNode node = stack.removeLast();
            values.addFirst(node.val);
            
            if (node.left != null) nextStack.addFirst(node.left);
            if (node.right != null) nextStack.addFirst(node.right);
            
            if (stack.size() == 0) {
                res.add(values.get(0));
                values = new LinkedList<Integer>();
                stack = nextStack;
                nextStack = new LinkedList<TreeNode>();
            }
        }
        
        return res;
    }
}