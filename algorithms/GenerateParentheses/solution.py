class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        res = []
        self.backtrack('', n, n, res)
        return res
    
    def backtrack(self, s, left, right, res):
        if left == 0 and right == 0:
            res.append(s)
            return
        
        if left > 0:
            self.backtrack(s + '(', left - 1, right, res)
        if left < right:
            self.backtrack(s + ')', left, right - 1, res)