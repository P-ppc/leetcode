# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def insertIntoBST(self, root, val):
        """
        :type root: TreeNode
        :type val: int
        :rtype: TreeNode
        """
        if not root:
            return TreeNode(val)
        
        p = root
        pre = root
        while p:
            pre = p
            if val < p.val:
                p = p.left
            else:
                p = p.right
        
        if val < pre.val:
            pre.left = TreeNode(val)
        else:
            pre.right = TreeNode(val)

        return root