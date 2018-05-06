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
var maxDepth = function(root) {
    if (root === null) {
        return 0
    }
    
    let depthList = []
    let depthMapList = [
        {
            node: root,
            depth: 1
        }
    ]
    
    while (depthMapList.length > 0) {
        let depthMap = depthMapList.shift()
        if (depthMap.node.left !== null) {
            depthMapList.push({
                node: depthMap.node.left,
                depth: depthMap.depth + 1
            })
        }
        if (depthMap.node.right !== null) {
            depthMapList.push({
                node: depthMap.node.right,
                depth: depthMap.depth + 1
            })
        }
        if (depthMap.node.left === null && depthMap.node.right === null) {
            depthList.push(depthMap.depth)
        }
    }
    return Math.max(...depthList)
};