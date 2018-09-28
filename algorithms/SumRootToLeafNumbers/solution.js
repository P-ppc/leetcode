/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var sumNumbers = function(root) {
    return root ? helper(root, 0) : 0
};

var helper = function (root, prefix) {
    if (!root.left && !root.right)
        return prefix * 10 + root.val
    else
        return (root.left ? helper(root.left, prefix * 10 + root.val) : 0) + (root.right ? helper(root.right, prefix * 10 + root.val) : 0)
}