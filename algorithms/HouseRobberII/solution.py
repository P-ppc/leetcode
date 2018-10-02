class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length = len(nums)
        if length == 1:
            return nums[0]
        
        dp1 = [0] * length
        dp2 = [0] * length
        
        for i in xrange(length - 1):
            # don't robber last
            dp1[i] = max(nums[i] + (dp1[i - 2] if i > 1 else 0), dp1[i - 1] if i > 0 else 0)
            # don't robber first
            dp2[i] = max(nums[i + 1] + (dp2[i - 2] if i > 1 else 0), dp2[i - 1] if i > 0 else 0)
            
        return max(dp1[length - 2], dp2[length - 2]) if length > 1 else 0