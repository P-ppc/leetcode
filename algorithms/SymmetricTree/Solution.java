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
    public boolean isSymmetric(TreeNode root) {
        List<TreeNode> levelQueue = new ArrayList<TreeNode>();
        List<TreeNode> nextLevelQueue = new ArrayList<TreeNode>();
        List<Integer> levelValueStack = new ArrayList<Integer>();
        
        if (root != null) levelQueue.add(root);
        
        while (levelQueue.size() > 0) {
            TreeNode node = levelQueue.get(levelQueue.size() - 1);
            levelQueue.remove(levelQueue.size() - 1);
            
            if (node == null) {
                levelValueStack.add(null);
            } else {
                levelValueStack.add(node.val);
                nextLevelQueue.add(node.left);
                nextLevelQueue.add(node.right);
            }
            
            if (levelQueue.size() == 0) {
                int start = 0,
                    end = levelValueStack.size() - 1;
                
                while (start <= end) {
                    if (levelValueStack.get(start) != levelValueStack.get(end)) {
                        return false;
                    } else {
                        start++;
                        end--;
                    }
                }
                
                levelQueue = nextLevelQueue;
                nextLevelQueue = new ArrayList<TreeNode>();
                levelValueStack = new ArrayList<Integer>();
            }
        }
        
        return true;
    }
}