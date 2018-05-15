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
var sumOfLeftLeaves = function(root) {
    if (!root) return 0
    if (!root.left && !root.right) return 0
    return sumOfLeftLeavesx(root.left, true) + sumOfLeftLeavesx(root.right, false)
};

function sumOfLeftLeavesx (node, isLeft) {
    if (!node) return 0
    if (!node.left && !node.right && isLeft) return node.val
    return sumOfLeftLeavesx(node.left, true) + sumOfLeftLeavesx(node.right, false)
}