class Solution(object):
    def findPeakElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        low = 0
        length = len(nums)
        high = length - 1
        
        while low <= high:
            mid = (low + high) / 2
            
            left_val = nums[mid - 1] if mid > 0 else nums[mid] - 1
            right_val = nums[mid + 1] if mid < length - 1 else nums[mid] - 1
            
            if nums[mid] < left_val:
                high = mid - 1
            elif nums[mid] < right_val:
                low = mid + 1
            else:
                # same with: left_val < nums[mid] > right_val
                return mid
            
                