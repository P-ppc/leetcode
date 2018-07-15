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
var levelOrder = function(root) {
    let res = [],
        stack = [],
        nextStack = [],
        values = []
    
    if (root) stack.push(root)
    
    while (stack.length > 0) {
        let node = stack.shift()
        values.push(node.val)
        
        if (node.left) nextStack.push(node.left)
        if (node.right) nextStack.push(node.right)
        
        if (stack.length === 0) {
            res.push(values)
            stack = nextStack
            values = []
            nextStack = []
        }
    }
    
    return res
};