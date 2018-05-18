# Binary Tree Preorder Traversal
Use recursion can easy to solve this problem, like below:
```
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def preorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        # root -> left -> right
        if not root:
            return []
        return [ root.val ] + self.preorderTraversal(root.left) + self.preorderTraversal(root.right)
```
But we have to use iteration to solve this problem, the stack is the solution