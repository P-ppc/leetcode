class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        # binary search the index
        start = 0
        end = len(nums) - 1
        
        while start < end:
            index = (start + end) / 2
            mid = nums[index]
            
            if mid < target:
                start = index + 1
            elif mid > target:
                end = index - 1
            else:
                return index
        
        if nums[start] < target:
            return start + 1
        else:
            return start