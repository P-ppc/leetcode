# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def longestUnivaluePath(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        longest_path = 0
        path_map = {}
        stack = []
        
        if root: stack.append(root)
        
        while len(stack) > 0:
            node = stack[-1]
            if node.left and path_map.get(node.left) == None:
                stack.append(node.left)
            elif node.right and path_map.get(node.right) == None:
                stack.append(node.right)
            else:
                stack.pop()
                path = 0
                
                if node.left != None or node.right != None:
                    left_path = 1 + path_map.get(node.left) if node.left != None and node.left.val == node.val else 0
                    right_path = 1 + path_map.get(node.right) if node.right != None and node.right.val == node.val else 0
                    path_map[node] = max(left_path, right_path)
                    path = left_path + right_path
                else:
                    path_map[node] = 0
                    
                longest_path = max(longest_path, path)
        
        return longest_path