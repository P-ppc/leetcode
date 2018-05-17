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
var inorderTraversal = function(root) {
    if (!root) {
        return []
    }
    let stack = [root],
        res = []
    
    while (stack.length > 0) {
        let node = stack[stack.length - 1]
        if (node.left && node.travered === undefined) {
            node.travered = true
            stack.push(node.left)
        } else {
            node = stack.pop()
            res.push(node.val)
            if (node.right) {
                stack.push(node.right)
            }
        }
    }
    return res
};