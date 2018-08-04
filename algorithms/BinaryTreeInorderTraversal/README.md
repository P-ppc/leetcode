# Binary Tree Inorder Traversal
Use recursion can easy to solve this problem, like below:
```python
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
        return self.inorderTraversal(root.left) + [ root.val ] + self.inorderTraversal(root.right)
```
But we have to use iteration to solve this problem, the stack and the hashmap is the solution