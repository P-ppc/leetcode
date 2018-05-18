/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var preorderTraversal = function(root) {
    if (root === null) {
        return []
    }
    let stack = [root],
        res = []
    while (stack.length > 0) {
        let node = stack.pop()
        res.push(node.val)
        if (node.right) stack.push(node.right)
        if (node.left) stack.push(node.left)
    }
    return res
};