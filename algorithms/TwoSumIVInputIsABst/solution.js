/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} k
 * @return {boolean}
 */
var findTarget = function(root, k) {
    let differMap = {},
        levelStack = [],
        nextLevelStack = []
    
    if (root) levelStack.push(root)
    
    while (levelStack.length > 0) {
        let node = levelStack.pop()
        
        if (differMap[node.val] === undefined) differMap[k - node.val] = node.val
        else return true
        
        if (node.left) nextLevelStack.push(node.left)
        if (node.right) nextLevelStack.push(node.right)
        
        if (levelStack.length === 0) {
            levelStack = nextLevelStack
            nextLeveStack = []
        }
    }
    
    return false
};