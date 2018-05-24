# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def getMinimumDifference(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        # inorder traversal
        stack = [root]
        travered_map = {}
        values = []
        while len(stack) > 0:
            node = stack[-1]
            if node.left and travered_map.get(node) == None:
                travered_map[node] = True
                stack.append(node.left)
            else:
                stack.pop()
                values.append(node.val)
                if node.right:
                    stack.append(node.right)
        min_diff = None
        for i in range(1, len(values)):
            if min_diff == None:
                min_diff = values[i] - values[i - 1]
            else:
                min_diff = min(min_diff, values[i] - values[i - 1])
        return min_diff