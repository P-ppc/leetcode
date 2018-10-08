# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def addOneRow(self, root, v, d):
        """
        :type root: TreeNode
        :type v: int
        :type d: int
        :rtype: TreeNode
        """
        if d == 1:
            node = TreeNode(v)
            node.left = root
            return node
        
        depth = 1
        stack = [ root ]
        next_stack = []
        while depth < d - 1:
            node = stack.pop()
            if node.left:
                next_stack.append(node.left)
            if node.right:
                next_stack.append(node.right)
            if len(stack) == 0:
                stack = next_stack
                next_stack = []
                depth += 1
                
        while len(stack) > 0:
            node = stack.pop()
            left = TreeNode(v)
            left.left = node.left
            node.left = left
            right = TreeNode(v)
            right.right = node.right
            node.right = right
        
        return root