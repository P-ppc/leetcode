/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var convertBST = function(root) {
    let greaterSum = 0,
        rightTraveredMap = new Map(),
        stack = []
    
    if (root !== null) stack.push(root)
    
    while (stack.length > 0) {
        let node = stack[stack.length - 1]
        
        if (node.right !== null && rightTraveredMap.get(node) === undefined) {
            rightTraveredMap.set(node, true)
            stack.push(node.right)
        } else {
            stack.pop()
            node.val += greaterSum
            greaterSum = node.val
            
            if (node.left !== null) {
                stack.push(node.left)
            }
        }
    }
    
    return root
};