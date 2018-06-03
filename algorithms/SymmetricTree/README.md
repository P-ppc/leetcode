# Symmetric Tree
This problem is easy to solve, the recursive solution is like below:
```
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root:
            return True
        return self.isSymmetricNode(root.left, root.right)
    
    def isSymmetricNode(self, left, right):
        if not left and not right:
            return True
        if not left and right:
            return False
        if left and not right:
            return False
        if left.val == right.val:
            return self.isSymmetricNode(left.left, right.right) and self.isSymmetricNode(left.right, right.left)
        else:
            return False
```