/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {number[]} nums
 * @return {TreeNode}
 */
var sortedArrayToBST = function(nums) {
    if (nums.length === 0) {
        return null
    }
    let root = new TreeNode(nums[parseInt(nums.length / 2)])
    root.left = sortedArrayToBST(nums.slice(0, parseInt(nums.length / 2)))
    root.right = sortedArrayToBST(nums.slice(parseInt(nums.length / 2) + 1, nums.length))
    return root
};