# Convert Bst To Greater Tree
We can simply inorder traversal the tree and reverse the result then get sum, just like below:
```
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
        left_travered_map = {}
        reversed_inorder_stack = []
        stack = []
        
        if root:
            stack.append(root)
            
        while len(stack) > 0:
            node = stack[-1]
            
            if node.left and left_travered_map.get(node) == None:
                left_travered_map[node] = True
                stack.append(node.left)
            else:
                stack.pop()
                reversed_inorder_stack.insert(0, node)
                if node.right:
                    stack.append(node.right)
                    
        greater_sum = 0
        for node in reversed_inorder_stack:
            node.val += greater_sum
            greater_sum = node.val
        
        return root
```
Or use right -> root -> left to traversal the tree