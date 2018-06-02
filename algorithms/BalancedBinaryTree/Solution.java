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
    public boolean isBalanced(TreeNode root) {
        Map<TreeNode, Integer> depthMap = new HashMap<TreeNode, Integer>();
        Map<TreeNode, Boolean> leftTraveredMap = new HashMap<TreeNode, Boolean>();
        Map<TreeNode, Boolean> rightTraveredMap = new HashMap<TreeNode, Boolean>();
        List<TreeNode> stack = new ArrayList<TreeNode>();
        
        if (root != null) stack.add(root);
        
        while (stack.size() > 0) {
            TreeNode node = stack.get(stack.size() - 1);
            
            if (node.left != null && leftTraveredMap.get(node) == null) {
                leftTraveredMap.put(node, true);
                stack.add(node.left);
            } else if (node.right != null && rightTraveredMap.get(node) == null) {
                rightTraveredMap.put(node, true);
                stack.add(node.right);
            } else {
                stack.remove(stack.size() - 1);
                int leftDepth = depthMap.get(node.left) == null ? 0 : depthMap.get(node.left);
                int rightDepth = depthMap.get(node.right) == null ? 0 : depthMap.get(node.right);
                depthMap.put(node, Math.max(leftDepth, rightDepth) + 1);
                if (Math.abs(leftDepth - rightDepth) > 1) {
                    return false;
                }
            }
        }
        
        return true;
    }
}