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
    public int minDiffInBST(TreeNode root) {
        Map<TreeNode, Boolean> leftTraveredMap = new HashMap<TreeNode, Boolean>();
        List<TreeNode> stack = new ArrayList<TreeNode>();
        TreeNode prevNode = null;
        int minDiff = Integer.MAX_VALUE;
        
        if (root != null) stack.add(root);
        
        while (stack.size() > 0) {
            TreeNode node = stack.get(stack.size() - 1);
            if (node.left != null && leftTraveredMap.get(node) == null) {
                leftTraveredMap.put(node, true);
                stack.add(node.left);
            } else {
                stack.remove(stack.size() - 1);
                if (prevNode != null) {
                    minDiff = Math.min(minDiff, node.val - prevNode.val);
                }
                prevNode = node;
                if (node.right != null) {
                    stack.add(node.right);
                }
            }
        }
        
        return minDiff;
    }
}