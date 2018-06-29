/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} sum
 * @return {number}
 */
var pathSum = function(root, sum) {
    return helper(root, sum, 0, [])
};

var helper = function(node, sum, curSum, paths) {
    if (!node) {
        return 0
    }
    
    let res = 0
    curSum += node.val
    paths.push(node.val)
    
    if (curSum === sum) {
        res++
    }
    let tempSum = curSum
    
    for (let i = 0; i < paths.length - 1; i++) {
        tempSum -= paths[i]
        if (tempSum === sum) {
            res++
        }
    }
    
    if (node.left) {
        res += helper(node.left, sum, curSum, paths.slice(0))
    }
    if (node.right) {
        res += helper(node.right, sum, curSum, paths.slice(0))
    }
    return res
}
