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
    public int findTilt(TreeNode root) {
        int tilt = 0;
        List<TreeNode> stack = new ArrayList<TreeNode>();
        Map<TreeNode, Boolean> leftTraveredMap = new HashMap<TreeNode, Boolean>();
        Map<TreeNode, Boolean> rightTraveredMap = new HashMap<TreeNode, Boolean>();
        Map<TreeNode, Integer> sumMap = new HashMap<TreeNode, Integer>();
        
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
                int leftSum = 0;
                if (sumMap.get(node.left) != null) {
                    leftSum = sumMap.get(node.left);
                }
                int rightSum = 0;
                if (sumMap.get(node.right) != null) {
                    rightSum = sumMap.get(node.right);
                }
                sumMap.put(node, node.val + leftSum + rightSum);
                tilt += Math.abs(leftSum - rightSum);
            }
        }
        
        return tilt;
    }
}