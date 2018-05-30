# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def findSecondMinimumValue(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        # the second minimum value must be a leaf
        leaf_values = []
        
        stack = []
        if root:
            stack.append(root)
        
        while len(stack) > 0:
            node = stack.pop()
            if not node.right and not node.right:
                leaf_values.append(node.val)
            if node.left:
                stack.append(node.left)
            if node.right:
                stack.append(node.right)
        
        second_minimum_value = None
        min_leaf_value = sys.maxint
        for value in leaf_values:
            min_leaf_value = min(min_leaf_value, value)
        
        for value in leaf_values:
            if value > min_leaf_value and second_minimum_value:
                second_minimum_value = min(second_minimum_value, value)
            elif value > min_leaf_value:
                second_minimum_value = value
        
        if not second_minimum_value:
            return -1
        return second_minimum_value