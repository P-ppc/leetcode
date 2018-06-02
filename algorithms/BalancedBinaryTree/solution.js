/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isBalanced = function(root) {
    let depthMap = new Map(),
        leftTraveredMap = new Map(),
        rightTraveredMap = new Map(),
        stack = []
    
    if (root !== null) stack.push(root)
    
    while (stack.length > 0) {
        let node = stack[stack.length - 1]
        if (node.left && leftTraveredMap.get(node) === undefined) {
            leftTraveredMap.set(node, true)
            stack.push(node.left)
        } else if (node.right && rightTraveredMap.get(node) === undefined) {
            rightTraveredMap.set(node, true)
            stack.push(node.right)
        } else {
            stack.pop()
            let leftDepth = depthMap.get(node.left) || 0,
                rightDepth = depthMap.get(node.right) || 0
            depthMap.set(node, Math.max(leftDepth, rightDepth) + 1)
            if (Math.abs(leftDepth - rightDepth) > 1) {
                return false
            }
            
        }
    }
    
    return true
};