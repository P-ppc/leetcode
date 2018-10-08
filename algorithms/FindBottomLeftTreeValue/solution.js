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
var findBottomLeftValue = function(root) {
    let val = -1,
        stack = [ root ],
        nextStack = []
    
    while (stack.length > 0) {
        let node = stack.pop()
        
        if (node.right)
            nextStack.unshift(node.right)
        if (node.left)
            nextStack.unshift(node.left)
        
        if (stack.length == 0) {
            val = node.val
            stack = nextStack
            nextStack = []
        }
    }
    
    return val
};