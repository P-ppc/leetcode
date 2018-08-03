class Solution(object):
    def combinationSum2(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        res = []
        self.backtrack(candidates, [], target, res)
        return [[int(x) for x in s.split(',')] for s in res]
    
    def backtrack(self, candidates, temp, target, res):
        if target == 0:
            temp.sort()
            s = ','.join([str(x) for x in temp])
            if s not in res:
                res.append(s)
        else:
            for candidate in candidates:
                if candidate <= target:
                    t = temp[:]
                    t.append(candidate)
                    temp_candidates = candidates[:]
                    temp_candidates.remove(candidate)
                    self.backtrack(temp_candidates, t, target - candidate, res)
