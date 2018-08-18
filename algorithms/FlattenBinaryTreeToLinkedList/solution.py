# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def flatten(self, root):
        """
        :type root: TreeNode
        :rtype: void Do not return anything, modify root in-place instead.
        """
        rights = []
        
        node = root
        while node:
            if node.left and node.right:
                rights.append(node.right)
                
            if node.left:
                node.right = node.left
                node.left = None
            elif len(rights) > 0 and not node.right:
                node.right = rights.pop()
            node = node.right
