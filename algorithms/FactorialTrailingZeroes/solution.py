class Solution(object):
    def trailingZeroes(self, n):
        """
        :type n: int
        :rtype: int
        """
        count = 0
        step = 5

        while step <= n:
            count += n / step
            step *= 5
                
        return count