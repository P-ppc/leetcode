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
var getMinimumDifference = function(root) {
    let stack = [root],
        values = [],
        minDiff = null
    
    while (stack.length > 0) {
        let node = stack[stack.length - 1]
        if (node.left && node.travered === undefined) {
            node.travered = true
            stack.push(node.left)
        } else {
            stack.pop()
            values.push(node.val)
            if (node.right) stack.push(node.right)
        }
    }

    for (let i = 1; i < values.length; i++) {
        if (minDiff == null) minDiff = values[i] - values[i - 1]
        else minDiff = Math.min(minDiff, values[i] - values[i - 1])
    }
    return minDiff
};