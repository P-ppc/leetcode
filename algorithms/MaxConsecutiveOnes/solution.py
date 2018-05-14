class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = [ 0 ]
        for num in nums:
            if num == 1:
                res[-1] += 1
            else:
                res.append(0)
        return max(res)