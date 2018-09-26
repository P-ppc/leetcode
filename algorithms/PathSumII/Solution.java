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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if (root != null)
            backTrack(root, sum, new ArrayList<Integer>(), res);
        
        return res;
    }
    
    public void backTrack(TreeNode root, int target, List<Integer> temp, List<List<Integer>> res) {
        temp.add(root.val);
        
        if (root.left == null && root.right == null && root.val == target)
            res.add(temp);
        if (root.left != null)
            backTrack(root.left, target - root.val, new ArrayList<Integer>(temp), res);
        if (root.right != null)
            backTrack(root.right, target - root.val, new ArrayList<Integer>(temp), res);
    }
}