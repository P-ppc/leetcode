/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var pruneTree = function(root) {
    root.left = root.left ? helper(root.left) : null
    root.right = root.right ? helper(root.right) : null
    return root
};

var helper = function(root) {
    root.left = root.left ? helper(root.left) : null
    root.right = root.right ? helper(root.right) : null
    
    return (root.left || root.right || root.val == 1) ? root : null
}