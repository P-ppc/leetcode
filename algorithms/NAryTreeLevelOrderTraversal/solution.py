"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, children):
        self.val = val
        self.children = children
"""
class Solution(object):
    def levelOrder(self, root):
        """
        :type root: Node
        :rtype: List[List[int]]
        """
        res = []
        stack = []
        next_stack = []
        values = []
        
        if root: stack.append(root)
            
        while len(stack) > 0:
            node = stack[0]
            stack = stack[1:]
            values.append(node.val)
            
            next_stack += node.children
            
            if len(stack) == 0:
                res.append(values)
                values = []
                stack = next_stack
                next_stack = []
        
        return res