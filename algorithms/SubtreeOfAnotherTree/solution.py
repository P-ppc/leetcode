# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSubtree(self, s, t):
        """
        :type s: TreeNode
        :type t: TreeNode
        :rtype: bool
        """
        if not s and not t:
            return True
        elif (not s and t) or (s and not t):
            return False
        elif self.isSameTree(s, t):
            return True
        else:
            return self.isSubtree(s.left, t) or self.isSubtree(s.right, t)
    
    def isSameTree(self, s, t):
        if s.val == t.val:
            if not s.left and not s.right and not t.left and not t.right:
                return True
            elif s.left and s.right and t.left and t.right:
                return self.isSameTree(s.left, t.left) and self.isSameTree(s.right, t.right)
            elif s.left and not s.right and t.left and not t.right:
                return self.isSameTree(s.left, t.left)
            elif not s.left and s.right and not t.left and t.right:
                return self.isSameTree(s.right, t.right)
        return False    