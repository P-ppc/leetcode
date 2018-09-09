class Solution(object):
    def countArrangement(self, N):
        """
        :type N: int
        :rtype: int
        """
        res = []
        self.backtrack(range(1, N + 1), [], res)
        return len(res)
    
    def backtrack(self, candidates, temp, res):
        if len(candidates) == 0:
            res.append(temp)
        else:
            i = len(temp) + 1
            for c in candidates:
                if c % i == 0 or i % c == 0:
                    temp_candidates = candidates[:]
                    temp_candidates.remove(c)
                    t = temp[:]
                    t.append(c)
                    self.backtrack(temp_candidates, t, res)