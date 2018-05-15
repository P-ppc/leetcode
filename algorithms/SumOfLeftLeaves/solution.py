# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sumOfLeftLeaves(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root:
            return 0
        if not root.left and not root.right:
            # root is not left leave
            return 0
        return self.sumOfLeftLeavesx(root.left) + self.sumOfLeftLeavesx(root.right, is_left = False)
        
    def sumOfLeftLeavesx(self, node, is_left = True):
        if not node:
            return 0
        if not node.left and not node.right and is_left:
            return node.val
        return self.sumOfLeftLeavesx(node.left) + self.sumOfLeftLeavesx(node.right, is_left = False)
        