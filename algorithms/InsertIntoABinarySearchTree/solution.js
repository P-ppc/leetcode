/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} val
 * @return {TreeNode}
 */
var insertIntoBST = function(root, val) {
    if (!root)
        return new TreeNode(val)
    
    let p = root,
        pre = null
    
    while (p) {
        pre = p
        if (val < p.val)
            p = p.left
        else
            p = p.right
    }
    
    if (val < pre.val)
        pre.left = new TreeNode(val)
    else
        pre.right = new TreeNode(val)
    
    return root
};