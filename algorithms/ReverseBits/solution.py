class Solution(object):
    def reverseBits(self, n):
        """
        :type n: int
        :rtype: int
        """
        res = 0
        count = 0
        
        while n > 0:
            res <<= 1
            res += n & 1
            n >>= 1
            count += 1
            
        res <<= 32 - count
            
        return res