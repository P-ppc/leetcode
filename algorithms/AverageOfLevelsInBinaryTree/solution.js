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
var averageOfLevels = function(root) {
    
    let res = [],
        level = root === null ? [] : [root]
    
    while (level.length > 0) {
        res.push(level.reduce((x, y) => x + y.val, 0) / level.length)
        temp = []
        level.forEach(node => {
            if (node.left) temp.push(node.left)   
            if (node.right) temp.push(node.right)
        })
        level = temp
    }
    
    return res
};