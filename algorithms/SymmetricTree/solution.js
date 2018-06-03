/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isSymmetric = function(root) {
    let levelQueue = [],
        levelValueStack = [],
        nextLevelQueue = []
    
    if (root) levelQueue.push(root)
    
    while (levelQueue.length > 0) {
        let node = levelQueue.shift()
        
        if (node) {
            levelValueStack.push(node.val)
            nextLevelQueue.push(node.left)
            nextLevelQueue.push(node.right)
        } else {
            levelValueStack.push(null)
        }
        
        if (levelQueue.length === 0) {
            let start = 0,
                end = levelValueStack.length - 1
            
            while (start <= end) {
                if (levelValueStack[start] !== levelValueStack[end]) {
                    return false
                } else {
                    start++
                    end--
                }
            }
            
            levelQueue = nextLevelQueue
            nextLevelQueue = []
            levelValueStack = []
        }
    }
    
    return true
};