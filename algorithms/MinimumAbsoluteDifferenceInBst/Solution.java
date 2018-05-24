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
    public int getMinimumDifference(TreeNode root) {
        List<TreeNode> stack = new ArrayList<TreeNode>();
        List<Integer> values = new ArrayList<Integer>();
        Map<TreeNode, Boolean> traveredMap = new HashMap<TreeNode, Boolean>();
        int minDiff = Integer.MAX_VALUE;
        
        stack.add(root);
        while (stack.size() > 0) {
            int lastIndex = stack.size() - 1;
            TreeNode node = stack.get(lastIndex);
            if (node.left != null && traveredMap.get(node) == null) {
                traveredMap.put(node, true);
                stack.add(node.left);
            } else {
                stack.remove(lastIndex);
                values.add(node.val);
                if (node.right != null) {
                    stack.add(node.right);
                }
            }
        }
        for (int i = 1; i < values.size(); i++) {
            minDiff = Math.min(minDiff, values.get(i) - values.get(i - 1));
        }
        return minDiff;
    }
}