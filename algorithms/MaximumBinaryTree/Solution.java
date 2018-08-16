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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }
    
    public TreeNode build(int[] nums, int beg, int end) {
        if (beg > end) return null;
        
        int maxIndex = beg;
        for (int i = beg; i <= end; i++) {
            if (nums[i] > nums[maxIndex]) maxIndex = i;
        }
        
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = build(nums, beg, maxIndex - 1);
        root.right = build(nums, maxIndex + 1, end);
        return root;
    }
}