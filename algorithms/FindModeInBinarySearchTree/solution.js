/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var findMode = function(root) {
    let params = {
        res: [],
        maxCount: 0,
        curCount: 0,
        prev: null
    }
    
    if (root) {
        inOrderTraveral(root, params)
    }
    return params.res
};

var inOrderTraveral = function (node, params) {
    if (node.left) {
        inOrderTraveral(node.left, params) 
    }
    
    if (params.prev === node.val) {
        params.curCount++
    } else {
        params.curCount = 1
    }
    
    if (params.curCount > params.maxCount) {
        params.maxCount = params.curCount
        params.res.splice(0, params.res.length)
        params.res.push(node.val)
    } else if (params.curCount === params.maxCount) {
        params.res.push(node.val)
    }
    
    params.prev = node.val
    
    if (node.right) {
        inOrderTraveral(node.right, params) 
    }
}