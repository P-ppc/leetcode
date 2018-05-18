# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def postorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        # left -> right -> root
        if not root:
            return []
        stack = [root]
        travered_left_map = {}
        travered_right_map = {}
        res = []
        while len(stack) > 0:
            node = stack[-1]
            if node.left and travered_left_map.get(node) == None:
                travered_left_map[node] = True
                stack.append(node.left)
            elif node.right and travered_right_map.get(node) == None:
                travered_right_map[node] = True
                stack.append(node.right)
            else:
                stack.pop()
                res.append(node.val)
        return res