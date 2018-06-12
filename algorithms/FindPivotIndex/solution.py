class Solution(object):
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        total_sum = 0
        left_sum = 0
        
        for num in nums:
            total_sum += num
            
        for i in range(len(nums)):
            right_sum = total_sum - nums[i] - left_sum
            if left_sum == right_sum:
                return i
            left_sum += nums[i]
            
        return -1