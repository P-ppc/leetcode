# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isBalanced(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        depth_map = {}
        left_travered_map = {}
        right_travered_map = {}
        stack = []
        
        if root: stack.append(root)
        
        while len(stack) > 0:
            # postorder
            node = stack[-1]
            if node.left and left_travered_map.get(node) == None:
                left_travered_map[node] = True
                stack.append(node.left)
            elif node.right and right_travered_map.get(node) == None:
                right_travered_map[node] = True
                stack.append(node.right)
            else:
                stack.pop()
                left_depth = depth_map.get(node.left, 0)
                right_depth = depth_map.get(node.right, 0)
                depth_map[node] = max(left_depth, right_depth) + 1
                if abs(left_depth - right_depth) > 1:
                    return False
        
        return True