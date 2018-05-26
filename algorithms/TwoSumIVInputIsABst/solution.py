# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def findTarget(self, root, k):
        """
        :type root: TreeNode
        :type k: int
        :rtype: bool
        """
        differ_map = {}
        level_stack = []
        next_level_stack = []
        
        if root:
            level_stack.append(root)
            
        while len(level_stack) > 0:
            node = level_stack.pop()
            if differ_map.get(node.val) == None:
                differ_map[k - node.val] = node.val
            else:
                return True
            
            if node.left:
                next_level_stack.append(node.left)
            if node.right:
                next_level_stack.append(node.right)
            if len(level_stack) == 0:
                level_stack = next_level_stack
                next_leve_stack = []
        return False