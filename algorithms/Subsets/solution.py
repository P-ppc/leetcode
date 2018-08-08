class Solution(object):
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res = []
        self.backtrack(0, nums, [], res)
        return res
    
    def backtrack(self, beg, nums, temp, res):
        if beg <= len(nums):
            res.append(temp)
            for i in xrange(beg, len(nums)):
                num = nums[i]
                t = temp[:]
                t.append(num)
                self.backtrack(i + 1, nums, t, res)