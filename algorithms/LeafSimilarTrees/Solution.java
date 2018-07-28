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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leafs1 = new ArrayList<Integer>(),
                      leafs2 = new ArrayList<Integer>();
        List<TreeNode> stack1 = new ArrayList<TreeNode>(),
                       stack2 = new ArrayList<TreeNode>();
        
        if (root1 != null) stack1.add(root1);
        if (root2 != null) stack2.add(root2);
        
        while (stack1.size() > 0) {
            TreeNode node = stack1.get(stack1.size() - 1);
            stack1.remove(stack1.size() - 1);
            
            if (node.right != null) {
                stack1.add(node.right);
            }
            if (node.left != null) {
                stack1.add(node.left);
            }
            if (node.left == null && node.right == null) {
                leafs1.add(node.val);
            }
        }
        
        while (stack2.size() > 0) {
            TreeNode node = stack2.get(stack2.size() - 1);
            stack2.remove(stack2.size() - 1);
            
            if (node.right != null) {
                stack2.add(node.right);
            }
            if (node.left != null) {
                stack2.add(node.left);
            }
            if (node.left == null && node.right == null) {
                leafs2.add(node.val);
            }
        }
        
        if (leafs1.size() != leafs2.size()) return false;
        
        for (int i = 0; i < leafs1.size(); i++) {
            if (leafs1.get(i) != leafs2.get(i)) return false;
        }
        
        return true;
    }
}