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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<TreeNode> levelQueue = new ArrayList<TreeNode>();
        List<TreeNode> nextLevelQueue = new ArrayList<TreeNode>();
        List<Integer> levelValues = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if (root != null) levelQueue.add(root);
        
        while (levelQueue.size() > 0) {
            TreeNode node = levelQueue.get(0);
            levelQueue.remove(0);
            levelValues.add(node.val);
            
            if (node.left != null) nextLevelQueue.add(node.left);
            if (node.right != null) nextLevelQueue.add(node.right);
            
            if (levelQueue.size() == 0) {
                levelQueue = nextLevelQueue;
                nextLevelQueue = new ArrayList<TreeNode>();
                res.add(levelValues);
                levelValues = new ArrayList<Integer>();
            }
        }
        
        Collections.reverse(res);
        return res;
    }
}