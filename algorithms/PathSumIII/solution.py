# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def pathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: int
        """
        return self.helper(root, sum, 0, [])
    
    def helper(self, node, sm, cur_sum, paths):
        if not node:
            return 0
        
        res = 0
        cur_sum += node.val
        paths.append(node.val)
        
        if cur_sum == sm:
            res += 1
        temp_sum = cur_sum
        for i in range(len(paths) - 1):
            temp_sum -= paths[i]
            if temp_sum == sm:
                res += 1
        
        
        if node.left:
            res += self.helper(node.left, sm, cur_sum, paths[:])
        if node.right:
            res += self.helper(node.right, sm, cur_sum, paths[:])
            
        return res