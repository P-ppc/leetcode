class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        res = 0
        is_negative = x < 0
        x = abs(x)
        
        while x > 0:
            res = res * 10 + x % 10
            x /= 10
        
        res = res if not is_negative else - res
        return res if pow(-2, 31) <= res <= pow(2, 31) - 1 else 0