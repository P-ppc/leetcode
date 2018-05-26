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
    public boolean findTarget(TreeNode root, int k) {
        Map<Integer, Integer> differMap = new HashMap<Integer, Integer>();
        List<TreeNode> levelQueue = new ArrayList<TreeNode>();
        List<TreeNode> nextLevelQueue = new ArrayList<TreeNode>();
        
        if (root != null) levelQueue.add(root);
        
        while (levelQueue.size() > 0) {
            TreeNode node = levelQueue.get(0);
            levelQueue.remove(0);
            
            if (differMap.get(node.val) == null) differMap.put(k - node.val, node.val);
            else return true;
            
            if (node.left != null) nextLevelQueue.add(node.left);
            if (node.right != null) nextLevelQueue.add(node.right);
            
            if (levelQueue.size() == 0) {
                levelQueue = nextLevelQueue;
                nextLevelQueue = new ArrayList<TreeNode>();
            }
        }
        
        return false;
    }
}