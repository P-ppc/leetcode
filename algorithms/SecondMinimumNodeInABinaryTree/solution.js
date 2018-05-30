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
var findSecondMinimumValue = function(root) {
    let leafValues = [],
        stack = []
    
    if (root !== null) stack.push(root)
    
    while (stack.length > 0) {
        let node = stack.pop()
        if (node.left === null && node.right === null) leafValues.push(node.val)
        if (node.left) stack.push(node.left)
        if (node.right) stack.push(node.right)
    }
    
    let secondMinimumValue = null,
        minLeafValue = Math.min(...leafValues)
    
    leafValues.forEach(value => {
        if (value > minLeafValue && secondMinimumValue === null) secondMinimumValue = value
        else if (value > minLeafValue) secondMinimumValue = Math.min(secondMinimumValue, value)
    })
    
    if (secondMinimumValue === null) return -1
    return secondMinimumValue
};