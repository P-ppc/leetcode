# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def minDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        level_stack = []
        next_level_stack = []
        min_depth = 0
        
        if root: level_stack.append(root)
            
        while len(level_stack) > 0:
            node = level_stack.pop()
            if not node.left and not node.right:
                min_depth += 1
                break
            if node.left:
                next_level_stack.append(node.left)
            if node.right:
                next_level_stack.append(node.right)
            if len(level_stack) == 0:
                level_stack = next_level_stack
                next_level_stack = []
                min_depth += 1
        
        return min_depth