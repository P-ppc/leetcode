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
var postorderTraversal = function(root) {
    if (!root) return []
    
    let stack = [root],
        res = []
    
    while (stack.length > 0) {
        let node = stack[stack.length - 1]
        if (node.left && node.traveredLeft === undefined) {
            node.traveredLeft = true
            stack.push(node.left)
        } else if (node.right && node.traveredRight === undefined) {
            node.traveredRight = true
            stack.push(node.right)
        } else {
            stack.pop()
            res.push(node.val)
        }
    }
    return res
};