class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        max_sum = - sys.maxint
        cur_sum = - sys.maxint
        
        for num in nums:
            if cur_sum >= 0 and cur_sum + num >= 0:
                cur_sum += num
            else:
                cur_sum = num
            max_sum = max(max_sum, cur_sum)
        return max_sum