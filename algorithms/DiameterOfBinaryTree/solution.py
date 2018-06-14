# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def diameterOfBinaryTree(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        diameter = 0
        path_length_map = {}
        stack = []
        
        if root: stack.append(root)
        
        while len(stack) > 0:
            node = stack[-1]
            if node.left and path_length_map.get(node.left) == None:
                stack.append(node.left)
            elif node.right and path_length_map.get(node.right) == None:
                stack.append(node.right)
            else:
                stack.pop()
                left_path_length = path_length_map.get(node.left, 0)
                right_path_length = path_length_map.get(node.right, 0)
                diameter = max(diameter, left_path_length + right_path_length)
                path_length_map[node] = max(left_path_length, right_path_length) + 1
        
        return diameter
        