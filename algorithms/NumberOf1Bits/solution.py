class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        res = 0
        while n:
            if n & 0x01:
                res += 1
            n >>= 1
        return res