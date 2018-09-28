# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sumNumbers(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        return self.helper(root, 0) if root else 0
    
    def helper(self, root, prefix):
        if not root.left and not root.right:
            return prefix * 10 + root.val
        else:
            return (self.helper(root.left, prefix * 10 + root.val) if root.left else 0) + (self.helper(root.right, prefix * 10 + root.val) if root.right else 0)