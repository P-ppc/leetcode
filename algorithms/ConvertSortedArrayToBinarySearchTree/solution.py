# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        # for a binary search tree
        # this root is middle
        if len(nums) == 0:
            return None
        root = TreeNode(nums[len(nums) / 2])
        root.left = self.sortedArrayToBST(nums[0 : (len(nums) / 2)])
        root.right = self.sortedArrayToBST(nums[len(nums) / 2 + 1 : len(nums)])
        return root