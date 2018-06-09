/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} s
 * @param {TreeNode} t
 * @return {boolean}
 */
var isSubtree = function(s, t) {
    if (s === null && t === null) {
        return true
    } else if ((s === null && t !== null) || (s !== null && t === null)) {
        return false
    } else if (isSameTree(s, t)) {
        return true
    } else {
        return isSubtree(s.left, t) || isSubtree(s.right, t)
    }
};

var isSameTree = function(s, t) {
    if (s.val === t.val) {
        if (s.left === null && s.right === null && t.left === null && t.right === null) {
            return true
        } else if (s.left !== null && s.right !== null && t.left !== null && t.right !== null) {
            return isSameTree(s.left, t.left) && isSameTree(s.right, t.right)
        } else if (s.left !== null && s.right === null && t.left !== null && t.right === null) {
            return isSameTree(s.left, t.left)
        } else if (s.left === null && s.right !== null && t.left === null && t.right !== null) {
            return isSameTree(s.right, t.right)
        }
    }
    return false
}