class Solution(object):
    def getPermutation(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: str
        """
        res = ''
        candidates = range(1, n + 1)
        k = k - 1
        while len(candidates) > 1:
            n -= 1
            x = self.factorial(n)
            quotient = k / x
            k = k % x
            res += str(candidates[quotient])
            candidates.remove(candidates[quotient])
        
        res += str(candidates[0])
        return res

    def factorial(self, n):
        for i in xrange(1, n):
            n *= i
        return n