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
var diameterOfBinaryTree = function(root) {
    let diameter = 0,
        pathLengthMap = new Map(),
        stack = []
    
    if (root) stack.push(root)
    
    while (stack.length > 0) {
        let node = stack[stack.length - 1]
        
        if (node.left && pathLengthMap.get(node.left) === undefined) {
            stack.push(node.left)
        } else if (node.right && pathLengthMap.get(node.right) === undefined) {
            stack.push(node.right)
        } else {
            stack.pop()
            let leftPathLength = pathLengthMap.get(node.left) || 0,
                rightPathLength = pathLengthMap.get(node.right) || 0
            
            diameter = Math.max(diameter, leftPathLength + rightPathLength)
            pathLengthMap.set(node, Math.max(leftPathLength, rightPathLength) + 1)
        }
    }
    
    return diameter
};