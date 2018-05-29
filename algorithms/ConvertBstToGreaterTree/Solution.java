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
    public TreeNode convertBST(TreeNode root) {
        int greaterSum = 0;
        Map<TreeNode, Boolean> rightTraveredMap = new HashMap<TreeNode, Boolean>();
        List<TreeNode> stack = new ArrayList<TreeNode>();
        
        if (root != null) stack.add(root);
        
        while (stack.size() > 0) {
            TreeNode node = stack.get(stack.size() - 1);
            
            if (node.right != null && rightTraveredMap.get(node) == null) {
                rightTraveredMap.put(node, true);
                stack.add(node.right);
            } else {
                stack.remove(stack.size() - 1);
                node.val += greaterSum;
                greaterSum = node.val;
                
                if (node.left != null) {
                    stack.add(node.left);
                }
            }
        }
        
        return root;
    }
}