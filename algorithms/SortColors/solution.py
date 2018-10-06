class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        start = 0
        end = len(nums) - 1
        cur = 0
        
        while cur <= end:
            if nums[cur] == 0 and cur != start:
                nums[start], nums[cur] = nums[cur], nums[start]
                start += 1
            elif nums[cur] == 2 and cur != end:
                nums[end], nums[cur] = nums[cur], nums[end]
                end -= 1
            else:
                cur += 1
        
        