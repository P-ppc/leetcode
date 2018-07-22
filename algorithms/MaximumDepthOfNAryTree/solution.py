"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, children):
        self.val = val
        self.children = children
"""
class Solution(object):
    def maxDepth(self, root):
        """
        :type root: Node
        :rtype: int
        """
        max_depth = 0
        stack = []
        next_stack = []
        
        if root: stack.append(root)
            
        while len(stack) > 0:
            node = stack.pop()
            
            if len(node.children) > 0:
                next_stack += node.children
            
            if len(stack) == 0:
                max_depth += 1
                stack = next_stack
                next_stack = []
        
        return max_depth