/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {number[]} inorder
 * @param {number[]} postorder
 * @return {TreeNode}
 */
var buildTree = function(inorder, postorder) {
    return build(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1)
};

var build = function (inorder, inBeg, inEnd, postorder, postBeg, postEnd) {
    if (inBeg > inEnd) {
        return null
    }
    let root = new TreeNode(postorder[postEnd]),
        pos = inorder.indexOf(postorder[postEnd])
    
    pos = (inBeg <= pos && pos <= inEnd) ? pos : -1
    root.left = build(inorder, inBeg, pos - 1, postorder, postBeg, postBeg + (pos - inBeg - 1))
    root.right = build(inorder, pos + 1, inEnd, postorder, postBeg + (pos - inBeg), postEnd - 1)
    return root
};
