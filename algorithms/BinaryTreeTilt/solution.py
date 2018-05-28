# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def findTilt(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        tilt = 0
        stack = []
        left_travered_map = {}
        right_travered_map = {}
        sum_map = {}
        
        if root: stack.append(root)
        
        while len(stack) > 0:
            node = stack[-1]
            
            if node.left and left_travered_map.get(node) == None:
                left_travered_map[node] = True
                stack.append(node.left)
            elif node.right and right_travered_map.get(node) == None:
                right_travered_map[node] = True
                stack.append(node.right)
            else:
                stack.pop()
                sum_map[node] = sum_map.get(node.left, 0) + sum_map.get(node.right, 0) + node.val
                tilt += abs(sum_map.get(node.left, 0) - sum_map.get(node.right, 0))
            
        return tilt
