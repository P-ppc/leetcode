# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        level_queue = []
        level_value_stack = []
        next_level_queue = []
        
        if root:
            level_queue.append(root)
        
        while len(level_queue) > 0:
            node = level_queue[0]
            level_queue = level_queue[1:]
            
            if not node:
                level_value_stack.append(None)
            else:
                level_value_stack.append(node.val)
                next_level_queue.append(node.left)
                next_level_queue.append(node.right)
            
            if len(level_queue) == 0:
                start = 0
                end = len(level_value_stack) - 1
                while start <= end:
                    if level_value_stack[start] != level_value_stack[end]:
                        return False
                    else:
                        start += 1
                        end -= 1
                    
                level_queue = next_level_queue
                next_level_queue = []
                level_value_stack = []
        
        return True 