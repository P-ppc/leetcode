/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} t1
 * @param {TreeNode} t2
 * @return {TreeNode}
 */
var mergeTrees = function(t1, t2) {
    if (t1 === null) {
        return t2
    } else if (t2 === null) {
        return t1
    }
    
    let tree
    tree = new TreeNode(t1.val + t2.val);
    tree.left = mergeTrees(t1.left, t2.left)
    tree.right = mergeTrees(t1. right, t2.right)
    return tree
};