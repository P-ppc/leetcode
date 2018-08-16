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
var constructMaximumBinaryTree = function(nums) {
    return build(nums, 0, nums.length - 1)
};

var build = function(nums, beg, end) {
    if (beg > end) return null
    
    let maxIndex = beg
    for (let i = beg; i <= end; i++) {
        if (nums[maxIndex] < nums[i]) {
            maxIndex = i
        }
    }
    
    let root = new TreeNode(nums[maxIndex])
    root.left = build(nums, beg, maxIndex - 1)
    root.right = build(nums, maxIndex + 1, end)
    return root
};
