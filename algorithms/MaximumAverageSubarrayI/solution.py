class Solution(object):
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        max_sum = None
        cur_sum = 0
        pre_index = None
        
        for i in range(len(nums)):
            if i < k:
                cur_sum += nums[i]
                if i == k - 1: max_sum = cur_sum
            else:
                pre_index = 0 if pre_index == None else pre_index + 1
                cur_sum += nums[i] - nums[pre_index]
                max_sum = max(max_sum, cur_sum)
                
        return max_sum * 1.0 / k
                