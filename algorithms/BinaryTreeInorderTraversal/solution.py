# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        # left -> root -> right
        if not root:
            return []
        stack = [root]
        res = []
        traverd_map = {}
        while len(stack) > 0:
            node = stack[-1]
            if node.left and traverd_map.get(node) == None:
                traverd_map[node] = True
                stack.append(node.left)
            else:
                stack.pop()
                res.append(node.val)
                if node.right:
                    stack.append(node.right)
            
        return res