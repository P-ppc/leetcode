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
var findTilt = function(root) {
    let tilt = 0,
        stack = [],
        leftTraveredMap = new Map(),
        rightTraveredMap = new Map(),
        sumMap = new Map()
    
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
            sumMap.set(node, (sumMap.get(node.left) || 0) + (sumMap.get(node.right) || 0) + node.val)
            tilt += Math.abs((sumMap.get(node.left) || 0) - (sumMap.get(node.right) || 0))
        }
    }
    
    return tilt
};