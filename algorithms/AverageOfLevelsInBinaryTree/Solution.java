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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<Double>();
        List<TreeNode> level = new ArrayList<TreeNode>();
        if (root != null) level.add(root);
        
        while (level.size() > 0) {
            List<TreeNode> tempLevel = new ArrayList<TreeNode>();
            Double sum = 0D;
            for (TreeNode node : level) {
                sum += node.val;
                if (node.left != null) tempLevel.add(node.left);
                if (node.right != null) tempLevel.add(node.right);
            }
            
            res.add(sum / level.size());
            level = tempLevel;
        }
        return res;
    }
}