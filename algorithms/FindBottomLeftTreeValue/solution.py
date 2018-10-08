# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def findBottomLeftValue(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        val = -1
        stack = [root]
        next_stack = []
        
        while len(stack) > 0:
            node = stack.pop()
            if node.right:
                next_stack.insert(0, node.right)
            if node.left:
                next_stack.insert(0, node.left)
            
            if len(stack) == 0:
                val = node.val
                stack = next_stack
                next_stack = []
        
        return val