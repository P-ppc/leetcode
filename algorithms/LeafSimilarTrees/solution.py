# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def leafSimilar(self, root1, root2):
        """
        :type root1: TreeNode
        :type root2: TreeNode
        :rtype: bool
        """
        leafs1 = []
        leafs2 = []
        
        stack1 = []
        stack2 = []
        
        if root1: stack1.append(root1)
        if root2: stack2.append(root2)
        
        while len(stack1) > 0:
            node = stack1.pop()
            
            if node.right:
                stack1.append(node.right)
            if node.left:
                stack1.append(node.left)
            if not node.left and not node.right:
                leafs1.append(node.val)
                
        while len(stack2) > 0:
            node = stack2.pop()
            
            if node.right:
                stack2.append(node.right)
            if node.left:
                stack2.append(node.left)
            if not node.left and not node.right:
                leafs2.append(node.val)
                
        return leafs1 == leafs2