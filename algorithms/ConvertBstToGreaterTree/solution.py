# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def convertBST(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        greater_sum = 0
        right_travered_map = {}
        stack = []
        
        if root:
            stack.append(root)
            
        while len(stack) > 0:
            node = stack[-1]
            
            if node.right and right_travered_map.get(node) == None:
                right_travered_map[node] = True
                stack.append(node.right)
            else:
                stack.pop()
                node.val += greater_sum
                greater_sum = node.val
                if node.left:
                    stack.append(node.left)
        
        return root