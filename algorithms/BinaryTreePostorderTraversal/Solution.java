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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        List<TreeNode> stack = new ArrayList<TreeNode>();
        Map<TreeNode, Boolean> traveredLeftMap = new HashMap<TreeNode, Boolean>();
        Map<TreeNode, Boolean> traveredRightMap = new HashMap<TreeNode, Boolean>();
        
        if (root == null) {
            return res;
        }
        
        stack.add(root);
        
        while (stack.size() > 0) {
            TreeNode node = stack.get(stack.size() - 1);
            if (node.left != null && traveredLeftMap.get(node) == null) {
                traveredLeftMap.put(node, true);
                stack.add(node.left);
            } else if (node.right != null && traveredRightMap.get(node) == null) {
                traveredRightMap.put(node, true);
                stack.add(node.right);
            } else {
                stack.remove(stack.size() - 1);
                res.add(node.val);
            }
        }
        
        return res;
    }
}