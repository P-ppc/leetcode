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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<TreeNode> stack = new ArrayList<TreeNode>();
        List<Integer> res = new ArrayList<Integer>();
        Map<TreeNode, Boolean> map = new HashMap<TreeNode, Boolean>();
        
        if (root == null) return res;
        
        stack.add(root);
        while (stack.size() > 0) {
            TreeNode node = stack.get(stack.size() - 1);
            if (node.left != null && map.get(node) == null) {
                map.put(node, true);
                stack.add(node.left);
            } else {
                stack.remove(stack.size() - 1);
                res.add(node.val);
                if (node.right != null) {
                    stack.add(node.right);
                }
            }
        }
        return res;
    }
}