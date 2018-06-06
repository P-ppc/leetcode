# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def minDiffInBST(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        left_travered_map = {}
        stack = []
        min_diff = sys.maxint
        prev_node = None
        
        if root: stack.append(root)
            
        while len(stack) > 0:
            node = stack[-1]
            if node.left and left_travered_map.get(node) == None:
                left_travered_map[node] = True
                stack.append(node.left)
            else:
                stack.pop()
                if prev_node:
                    min_diff = min(min_diff, node.val - prev_node.val)
                prev_node = node
                if node.right:
                    stack.append(node.right)
                
        return min_diff