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
var rightSideView = function(root) {
    let res = [],
        stack = [],
        nextStack = [],
        values = []
    
    if (root) stack.unshift(root)
    
    while (stack.length > 0) {
        let node = stack.pop()
        values.unshift(node.val)
        if (node.left) nextStack.unshift(node.left)
        if (node.right) nextStack.unshift(node.right)
        
        if (stack.length == 0) {
            res.push(values.shift())
            values = []
            stack = nextStack
            nextStack = []
        }
    }
    
    return res
};