/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
var zigzagLevelOrder = function(root) {
    let stack = [],
        nextStack = [],
        direction = 1,
        values = [],
        res = []
    
    if (root)
        stack.push(root)
    
    while (stack.length > 0) {
        let node = stack.shift()
        if (direction)
            values.push(node.val)
        else
            values.unshift(node.val)
        
        if (node.left)
            nextStack.push(node.left)
        if (node.right)
            nextStack.push(node.right)
        
        if (stack.length == 0) {
            direction = direction ? 0 : 1
            res.push(values)
            values = []
            stack = nextStack
            nextStack = []
        }
    }
    
    return res
};