/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {string[]}
 */
var binaryTreePaths = function(root) {
    if (root === null) {
        return []
    }
    
    let res = [],
        paths = [
            {
                node: root,
                path: String(root.val)
            }
        ]
    
    while (paths.length > 0) {
        let path = paths.pop()
        if (path.node.left === null && path.node.right === null) {
            res.push(path.path)
        }
        if (path.node.left !== null) {
            paths.push({
                node: path.node.left,
                path: path.path + '->' + String(path.node.left.val)
            })
        }
        if (path.node.right !== null) {
            paths.push({
                node: path.node.right,
                path: path.path + '->' + String(path.node.right.val)
            })
        }
    }
    return res
};