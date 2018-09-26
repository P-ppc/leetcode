/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} sum
 * @return {number[][]}
 */
var pathSum = function(root, sum) {
    let res = []
    if (root)
        backTrack(root, sum, [], res)
    return res
};

var backTrack = function (root, target, temp, res) {
    temp.push(root.val)
    
    if (!root.left && !root.right && root.val == target)
        res.push(temp)
    if (root.left)
        backTrack(root.left, target - root.val, temp.slice(), res)
    if (root.right)
        backTrack(root.right, target - root.val, temp.slice(), res)
};