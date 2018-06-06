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
var minDiffInBST = function(root) {
    let leftTraveredMap = new Map(),
        stack = [],
        minDiff = Number.MAX_VALUE,
        prevNode = null
    
    if (root !== null) stack.push(root)
    
    while (stack.length > 0) {
        let node = stack[stack.length - 1]
        
        if (node.left && leftTraveredMap.get(node) === undefined) {
            leftTraveredMap.set(node, true)
            stack.push(node.left)
        } else {
            stack.pop()
            if (prevNode !== null) {
                minDiff = Math.min(minDiff, node.val - prevNode.val)
            }
            prevNode = node
            if (node.right) {
                stack.push(node.right)
            }
        }
        
    }
    
    return minDiff
};