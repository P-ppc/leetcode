# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def buildTree(self, preorder, inorder):
        """
        :type preorder: List[int]
        :type inorder: List[int]
        :rtype: TreeNode
        """
        return self.build(preorder, 0, len(preorder) - 1, inorder, 0, len(inorder) - 1)
    
    def build(self, preorder, pre_beg, pre_end, inorder, in_beg, in_end):
        if in_beg > in_end:
            return None
        
        root = TreeNode(preorder[pre_beg])
        pos = inorder.index(preorder[pre_beg])
        pos = pos if in_beg <= pos <= in_end else -1
        
        root.left = self.build(preorder, pre_beg + 1, pre_beg + pos - in_beg, inorder, in_beg, pos - 1)
        root.right = self.build(preorder, pre_beg + pos - in_beg + 1, pre_end, inorder, pos + 1, in_end)
        
        return root