# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def constructMaximumBinaryTree(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        return self.build(nums, 0, len(nums) - 1)
    
    def build(self, nums, beg, end):
        if beg > end:
            return None
        
        max_index = beg
        for i in xrange(beg, end + 1):
            if nums[i] > nums[max_index]:
                max_index = i
        
        root = TreeNode(nums[max_index])
        root.left = self.build(nums, beg, max_index - 1)
        root.right = self.build(nums, max_index + 1, end)
        return root