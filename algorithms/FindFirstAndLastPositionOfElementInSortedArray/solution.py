class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        low = 0
        high = len(nums) - 1
        
        if high < 0:
            return -1, -1
        
        while low < high:
            mid = (low + high) / 2
            
            if nums[mid] < target:
                low = mid + 1
            elif nums[mid] > target:
                high = mid - 1
            else:
                high = mid
        
        if nums[low] != target:
            return -1, -1
        
        i = low        
        low = 0
        high = len(nums) - 1
        
        while low < high:
            mid = int(math.ceil((low + high) / 2.0))
            
            if nums[mid] < target:
                low = mid + 1
            elif nums[mid] > target:
                high = mid - 1
            else:
                low = mid
                
        return i, low