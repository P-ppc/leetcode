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
    public int pathSum(TreeNode root, int sum) {
        return helper(root, sum, 0, new ArrayList<Integer>());       
    }
    
    public int helper(TreeNode node, int sum, int curSum, List<Integer> paths) {
        if (node == null) return 0;
        
        int res = 0;
        curSum += node.val;
        paths.add(node.val);
        
        if (curSum == sum) res++;
        int tempSum = curSum;
        
        for (int i = 0; i < paths.size() - 1; i++) {
            tempSum -= paths.get(i);
            if (tempSum == sum) res++;
        }
        
        if (node.left != null) res += helper(node.left, sum, curSum, new ArrayList<Integer>(paths));
        if (node.right != null) res += helper(node.right, sum, curSum, new ArrayList<Integer>(paths));
        return res;
    }
}