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
var longestUnivaluePath = function(root) {
    let longestPath = 0,
        pathMap = new Map(),
        stack = []
    
    if (root) stack.push(root)
    
    while (stack.length > 0) {
        let node = stack[stack.length - 1]
        if (node.left && pathMap.get(node.left) === undefined) {
            stack.push(node.left)
        } else if (node.right && pathMap.get(node.right) === undefined) {
            stack.push(node.right)
        } else {
            stack.pop()
            let path = 0
            
            if (node.left || node.right) {
                let leftPath = node.left && node.left.val === node.val ? 1 + pathMap.get(node.left) : 0,
                    rightPath = node.right && node.right.val === node.val ? 1 + pathMap.get(node.right) : 0
                pathMap.set(node, Math.max(leftPath, rightPath))
                path = leftPath + rightPath
            } else {
                pathMap.set(node, 0)
            }
            
            longestPath = Math.max(longestPath, path)
        }
    }
        
    
    return longestPath
};