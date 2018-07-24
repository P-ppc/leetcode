"""
# Definition for a Node.
class Node(object):
    def __init__(self, val, children):
        self.val = val
        self.children = children
"""
class Solution(object):
    def postorder(self, root):
        """
        :type root: Node
        :rtype: List[int]
        """
        res = []
        stack = []
        travered_map = {}
        
        if root: stack.append(root)
            
        while len(stack) > 0:
            node = stack[-1]
            if travered_map.get(node) == None and len(node.children) > 0:
                stack += node.children[::-1]
                travered_map[node] = True
            else:
                res.append(node.val)
                stack.pop()
            
        return res