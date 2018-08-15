/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {number[]} preorder
 * @param {number[]} inorder
 * @return {TreeNode}
 */
var buildTree = function(preorder, inorder) {
    return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1)
};

var build = function(preorder, preBeg, preEnd, inorder, inBeg, inEnd) {
    if (inBeg > inEnd) {
        return null
    }
    
    let root = new TreeNode(preorder[preBeg]),
        pos = inorder.indexOf(preorder[preBeg])
    
    pos = inBeg <= pos && pos <= inEnd ? pos : -1
    
    root.left = build(preorder, preBeg + 1, preBeg + pos - inBeg, inorder, inBeg, pos - 1)
    root.right = build(preorder, preBeg + pos - inBeg + 1, preEnd, inorder, pos + 1, inEnd)
    
    return root
};
