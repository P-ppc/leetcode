class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        res = []
        self.backtrack(candidates, [], target, res)
        t = []
        for s in res:
            t.append([int(x) for x in s.split(',')])
        return t
    
    def backtrack(self, candidates, ans, target, res):
        if target == 0:
            ans.sort()
            s = ','.join([str(x) for x in ans])
            if s not in res:
                res.append(s)
            return
        else:
            for candidate in candidates:
                if candidate <= target:
                    temp = ans[:]
                    temp.append(candidate)
                    self.backtrack(candidates, temp, target - candidate, res)