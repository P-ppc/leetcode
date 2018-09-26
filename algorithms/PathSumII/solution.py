# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def pathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: List[List[int]]
        """
        res = []
        if root:
            self.backtrack(root, sum, [], res)
        return res
    
    def backtrack(self, root, target, temp, res):
        temp.append(root.val)
        
        if not root.left and not root.right and root.val == target:
            res.append(temp)
        if root.left:
            self.backtrack(root.left, target - root.val, temp[:], res)
        if root.right:
            self.backtrack(root.right, target - root.val, temp[:], res)
            
            