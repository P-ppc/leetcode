# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def hasPathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        left_travered_map = {}
        right_travered_map = {}
        path_sum_map = {}
        
        stack = []
        
        if root: stack.append(root)
            
        while len(stack) > 0:
            node = stack[-1]
            
            if node.left and left_travered_map.get(node) == None:
                left_travered_map[node] = True
                stack.append(node.left)
            elif node.right and right_travered_map.get(node) == None:
                right_travered_map[node] = True
                stack.append(node.right)
            else:
                stack.pop()
                left_path_sum_list = path_sum_map.get(node.left, [])
                right_path_sum_right = path_sum_map.get(node.right, [])
                path_sum_list = []
                for path_sum in left_path_sum_list + right_path_sum_right:
                    path_sum_list.append(path_sum + node.val)
                if len(path_sum_list) == 0:
                    path_sum_list.append(node.val)
                path_sum_map[node] = path_sum_list
                
        path_sum_list = path_sum_map.get(root, [])
        return sum in path_sum_list