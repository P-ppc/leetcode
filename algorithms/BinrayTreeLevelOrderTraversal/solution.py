# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        res = []
        stack = []
        next_stack = []
        level_values = []
        if root: stack.append(root)
            
        while len(stack) > 0:
            node = stack[0]
            stack = stack[1:]
            level_values.append(node.val)
            
            if node.left:
                next_stack.append(node.left)
            if node.right:
                next_stack.append(node.right)
            
            if len(stack) == 0:
                res.append(level_values)
                stack = next_stack
                level_values = []
                next_stack = []
        
        return res