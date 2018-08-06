class Solution(object):
    def combine(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: List[List[int]]
        """
        res = []
        self.backtrack(0, range(1, n + 1), k, [], res)
        return res
    
    def backtrack(self, beg, nums, k, temp, res):
        if len(temp) == k:
            res.append(temp)
        else:
            for i in xrange(beg, len(nums)):
                t = temp[:]
                t.append(nums[i])
                self.backtrack(i + 1, nums, k, t, res)