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
    public int longestUnivaluePath(TreeNode root) {
        int longestPath = 0;
        Map<TreeNode, Integer> pathMap = new HashMap<TreeNode, Integer>();
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        
        if (root != null) stack.addLast(root);
        
        while (stack.size() > 0) {
            TreeNode node = stack.getLast();
            
            if (node.left != null && pathMap.get(node.left) == null) {
                stack.addLast(node.left);
            } else if (node.right != null && pathMap.get(node.right) == null) {
                stack.addLast(node.right);
            } else {
                stack.removeLast();
                int path = 0;

                if (node.left != null || node.right != null) {
                    int leftPath = node.left != null && node.left.val == node.val ? 1 + pathMap.get(node.left) : 0,
                        rightPath = node.right != null && node.right.val == node.val ? 1 + pathMap.get(node.right) : 0;
                    pathMap.put(node, Math.max(leftPath, rightPath));
                    path = leftPath + rightPath;
                } else {
                    pathMap.put(node, 0);
                }

                longestPath = Math.max(longestPath, path);
            }
        }
        
        return longestPath;
    }
}