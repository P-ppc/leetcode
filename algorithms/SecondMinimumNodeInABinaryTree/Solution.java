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
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> leafValues = new ArrayList<Integer>();
        List<TreeNode> stack = new ArrayList<TreeNode>();
        
        if (root != null) stack.add(root);
        
        while (stack.size() > 0) {
            TreeNode node = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            
            if (node.left == null && node.right == null) leafValues.add(node.val);
            if (node.left != null) stack.add(node.left);
            if (node.right != null) stack.add(node.right);
        }
        
        int minLeafValue = Collections.min(leafValues),
            secondMinimumValue = -1;
        
        for (int value : leafValues) {
            if (value > minLeafValue && secondMinimumValue == -1) secondMinimumValue = value;
            else if (value > minLeafValue) secondMinimumValue = Math.min(secondMinimumValue, value);
        }
        
        return secondMinimumValue;
    }
}