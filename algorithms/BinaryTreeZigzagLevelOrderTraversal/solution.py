# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def zigzagLevelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        stack = []
        if root:
            stack.append(root)
        next_stack = []
        direction = 1
        values = []
        res = []
        
        while len(stack) > 0:
            node = stack[0]
            stack.remove(node)
            if direction:
                values.append(node.val)
            else:
                values.insert(0, node.val)
            
            if node.left:
                next_stack.append(node.left)
            if node.right:
                next_stack.append(node.right)
            
            if len(stack) == 0:
                direction = 0 if direction else 1
                res.append(values)
                values = []
                stack = next_stack
                next_stack = []
        
        return res