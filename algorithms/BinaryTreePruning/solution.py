# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def pruneTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        self.helper(root)
        return root
    
    def helper(self, root):
        left_flag = False if not root.left else self.helper(root.left)
        right_flag = False if not root.right else self.helper(root.right)
        if not left_flag:
            root.left = None
        if not right_flag:
            root.right = None
        return root.val == 1 or left_flag or right_flag