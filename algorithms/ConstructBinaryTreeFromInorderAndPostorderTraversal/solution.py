# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def buildTree(self, inorder, postorder):
        """
        :type inorder: List[int]
        :type postorder: List[int]
        :rtype: TreeNode
        """
        return self.build(inorder, 0, len(inorder) - 1, postorder, 0, len(postorder) - 1)

    def build(self, inorder, in_beg, in_end, postorder, post_beg, post_end):
        if in_beg > in_end:
            return None
        
        root = TreeNode(postorder[post_end])
        
        pos = inorder.index(postorder[post_end])
        pos = pos if in_beg <= pos <= in_end else -1
        
        root.left = self.build(inorder, in_beg, pos - 1, postorder, post_beg, post_beg + (pos - in_beg - 1))
        root.right = self.build(inorder, pos + 1, in_end, postorder, post_beg + (pos - in_beg), post_end - 1)
        
        return root