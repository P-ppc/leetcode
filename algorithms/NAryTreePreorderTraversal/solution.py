"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, children):
        self.val = val
        self.children = children
"""
class Solution(object):
    def preorder(self, root):
        """
        :type root: Node
        :rtype: List[int]
        """
        res = []
        stack = []
        
        if root: stack.append(root)
            
        while len(stack) > 0:
            node = stack[0]
            stack = stack[1:]
            res.append(node.val)
            
            for i in range(len(node.children))[::-1]:
                stack.insert(0, node.children[i])
            
        return res