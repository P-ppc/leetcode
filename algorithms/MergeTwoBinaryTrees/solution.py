# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def mergeTrees(self, t1, t2):
        """
        :type t1: TreeNode
        :type t2: TreeNode
        :rtype: TreeNode
        """
        if t1 is None:
            return t2
        elif t2 is None:
            return t1
        
        tree = TreeNode(t1.val + t2.val)
        tree.left = self.mergeTrees(t1.left, t2.left)
        tree.right = self.mergeTrees(t1. right, t2.right)
        return tree