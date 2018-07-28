/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root1
 * @param {TreeNode} root2
 * @return {boolean}
 */
var leafSimilar = function(root1, root2) {
    let leafs1 = [],
        leafs2 = [],
        stack1 = [],
        stack2 = []
    
    if (root1) stack1.push(root1)
    if (root2) stack2.push(root2)
    
    while (stack1.length > 0) {
        let node = stack1.pop()
        
        if (node.right) {
            stack1.push(node.right)
        }
        if (node.left) {
            stack1.push(node.left)
        }
        if (!node.left && !node.right) {
            leafs1.push(node.val)
        }
    }
    
    while (stack2.length > 0) {
        let node = stack2.pop()
        
        if (node.right) {
            stack2.push(node.right)
        }
        if (node.left) {
            stack2.push(node.left)
        }
        if (!node.left && !node.right) {
            leafs2.push(node.val)
        }
    }
    
    if (leafs1.length !== leafs2.length) return false
    
    for (let i = 0; i < leafs1.length; i++) {
        if (leafs1[i] !== leafs2[i]) return false
    }
    return true
};