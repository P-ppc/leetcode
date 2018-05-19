class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        start = 0
        end = len(nums) - 1
        while start < len(nums):
            if nums[start] == val:
                while nums[end] == val and end > start:
                    end -= 1
                if end == start:
                    break
                else:
                    nums[start], nums[end] = nums[end], nums[start]
            else:
                start += 1
        return start