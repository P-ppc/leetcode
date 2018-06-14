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
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter = 0;
        Map<TreeNode, Integer> pathLengthMap = new HashMap<TreeNode, Integer>();
        List<TreeNode> stack = new ArrayList<TreeNode>();
        
        if (root != null) stack.add(root);
        
        while (stack.size() > 0) {
            TreeNode node = stack.get(stack.size() - 1);
            
            if (node.left != null && pathLengthMap.get(node.left) == null) {
                stack.add(node.left);
            } else if (node.right != null && pathLengthMap.get(node.right) == null) {
                stack.add(node.right);
            } else {
                stack.remove(stack.size() - 1);
                int leftPathLength = pathLengthMap.containsKey(node.left) ? pathLengthMap.get(node.left) : 0,
                    rightPathLength = pathLengthMap.containsKey(node.right) ? pathLengthMap.get(node.right) : 0;
                diameter = Math.max(diameter, leftPathLength + rightPathLength);
                pathLengthMap.put(node, Math.max(leftPathLength, rightPathLength) + 1);
            }
        }
        
        return diameter;
    }
}