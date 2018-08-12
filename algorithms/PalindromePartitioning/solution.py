class Solution(object):
    def partition(self, s):
        """
        :type s: str
        :rtype: List[List[str]]
        """
        res = []
        self.backtrack(0, s, [], res)
        return res
    
    def backtrack(self, beg, s, temp, res):
        if beg == len(s):
            res.append(temp)
        else:
            for i in xrange(beg, len(s)):
                part = s[beg: i + 1]
                if part == part[::-1]:
                    t = temp[:]
                    t.append(part)
                    self.backtrack(i + 1, s, t, res)
    