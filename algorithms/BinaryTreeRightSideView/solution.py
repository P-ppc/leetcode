# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def rightSideView(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        res = []
        stack = []
        next_stack = []
        values = []
        
        if root: stack.insert(0, root)
        
        while len(stack) > 0:
            node = stack.pop()
            values.insert(0, node.val)
            
            if node.left: next_stack.insert(0, node.left)
            if node.right: next_stack.insert(0, node.right)
            
            if len(stack) == 0:
                res.append(values[0])
                values = []
                stack = next_stack
                next_stack = []
        
        return res