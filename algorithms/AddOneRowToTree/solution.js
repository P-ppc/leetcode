/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} v
 * @param {number} d
 * @return {TreeNode}
 */
var addOneRow = function(root, v, d) {
    if (d == 1) {
        let node = new TreeNode(v)
        node.left = root
        return node
    }
    
    let depth = 1,
        stack = [ root ],
        nextStack = []
    
    while (depth < d - 1) {
        let node = stack.pop()
        if (node.left)
            nextStack.push(node.left)
        if (node.right)
            nextStack.push(node.right)
        if (stack.length == 0) {
            stack = nextStack
            nextStack = []
            depth++
        }
    }
    
    while (stack.length > 0) {
        let node = stack.pop(),
            left = new TreeNode(v),
            right = new TreeNode(v)
        left.left = node.left
        node.left = left
        right.right = node.right
        node.right = right
    }
    
    return root
};