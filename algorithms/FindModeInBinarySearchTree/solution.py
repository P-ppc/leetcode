# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def findMode(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        res = []
        prev = None
        max_count = 0
        cur_count = 0
        left_travered_map = {}        
        stack = []
        
        if root: stack.append(root)
        
        while len(stack) > 0:
            node = stack[-1]
            if node.left and left_travered_map.get(node) == None:
                left_travered_map[node] = True
                stack.append(node.left)
            else:
                stack.pop()
                
                if prev == node.val:
                    cur_count += 1
                else:
                    cur_count = 1
                
                if cur_count > max_count:
                    max_count = cur_count
                    res = [node.val]
                elif cur_count == max_count:
                    res.append(node.val)
                
                prev = node.val
                
                if node.right:
                    stack.append(node.right)
        
        return res