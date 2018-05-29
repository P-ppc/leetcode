/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {TreeNode} p
 * @param {TreeNode} q
 * @return {TreeNode}
 */
var lowestCommonAncestor = function(root, p, q) {
    if (root === null) return root
    if (p === null) return q
    if (q === null) return p
    
    if (p.val > q.val) {
        let temp = q
        q = p
        p = temp
    }
    
    if (p.val <= root.val && root.val <= q.val) {
        return root
    } else if (root.val < p.val && root.val < q.val) {
        return lowestCommonAncestor(root.right, p, q)
    } else {
        return lowestCommonAncestor(root.left, p, q)
    }
};