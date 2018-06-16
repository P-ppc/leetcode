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
    public int minDepth(TreeNode root) {
        Map<TreeNode, Integer> minDepthMap = new HashMap<TreeNode, Integer>();
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        
        if (root != null) stack.addLast(root);
        
        while (stack.size() > 0) {
            TreeNode node = stack.getLast();
            
            if (node.left != null && minDepthMap.get(node.left) == null) {
                stack.addLast(node.left);
            } else if (node.right != null && minDepthMap.get(node.right) == null) {
                stack.addLast(node.right);
            } else {
                stack.removeLast();
                int leftMinDepth = minDepthMap.containsKey(node.left) ? minDepthMap.get(node.left) : 0,
                    rightMinDepth = minDepthMap.containsKey(node.right) ? minDepthMap.get(node.right) : 0;
                if (leftMinDepth == 0) {
                    minDepthMap.put(node, 1 + rightMinDepth);
                } else if (rightMinDepth == 0) {
                    minDepthMap.put(node, 1 + leftMinDepth);
                } else {
                    minDepthMap.put(node, 1 + Math.min(leftMinDepth, rightMinDepth));
                }
            }
        }
        
        return minDepthMap.containsKey(root) ? minDepthMap.get(root) : 0;
    }
}