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
var largestValues = function(root) {
    let res = [],
        stack = [],
        nextStack = [],
        values = []
    
    if (root) stack.push(root)
    
    while (stack.length > 0) {
        let node = stack.pop()
        values.push(node.val)
        
        if (node.left) nextStack.push(node.left)
        if (node.right) nextStack.push(node.right)
        
        if (stack.length == 0) {
            res.push(Math.max(...values))
            stack = nextStack
            nextStack = []
            values = []
        }
    }
    
    return res
};