class Solution(object):
    def combinationSum3(self, k, n):
        """
        :type k: int
        :type n: int
        :rtype: List[List[int]]
        """
        res = []
        self.backtrack(0, [1, 2, 3, 4, 5, 6, 7, 8, 9], [], k, n, res)
        return res
    
    def backtrack(self, beg, candidates, temp, k, target, res):
        if len(temp) == k and target == 0:
            res.append(temp)
        elif len(temp) < k:
            for i in xrange(beg, len(candidates)):
                c = candidates[i]
                if c <= target:
                    t = temp[:]
                    t.append(c)
                    self.backtrack(i + 1, candidates, t, k, target - c, res)
            