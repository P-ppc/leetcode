class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        length = len(nums)
        for i in range(0, length):
            if nums[i] != 0:
                continue
            for j in range(i, length):
                if nums[j] != 0:
                    nums[i], nums[j] = nums[j], nums[i]
                    break
                