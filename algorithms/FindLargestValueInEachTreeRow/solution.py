# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def largestValues(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        res = []
        
        stack = []
        if root: stack.append(root)
        next_stack = []
        values = []
        
        while len(stack) > 0:
            node = stack.pop()
            values.append(node.val)
            if node.left: next_stack.append(node.left)
            if node.right: next_stack.append(node.right)
                
            if len(stack) == 0:
                res.append(max(values))
                stack = next_stack
                next_stack = []
                values = []
        
        return res