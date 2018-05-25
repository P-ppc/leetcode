/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
var levelOrderBottom = function(root) {
    let levelQueue = [],
        tempLevelQueue = [],
        levelValues = [],
        res = []
    
    if (root) {
        levelQueue.push(root)
    }
    
    while (levelQueue.length > 0) {
        let node = levelQueue.shift()
        levelValues.push(node.val)
        
        if (node.left) tempLevelQueue.push(node.left)
        if (node.right) tempLevelQueue.push(node.right)
        if (levelQueue.length === 0) {
            levelQueue = tempLevelQueue
            res.push(levelValues)
            tempLevelQueue = []
            levelValues = []
        }
    }
    
    return res.reverse()
};