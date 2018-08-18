/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {void} Do not return anything, modify root in-place instead.
 */
var flatten = function(root) {
    let rights = []
    
    while (root) {
        if (root.left && root.right) {
            rights.push(root.right)
        }
        if (root.left) {
            root.right = root.left
            root.left = null
        } else if (!root.right && rights.length > 0) {
            root.right = rights.pop()
        }
        root = root.right
    }
};