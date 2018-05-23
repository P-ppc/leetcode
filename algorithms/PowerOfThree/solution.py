class Solution(object):
    def isPowerOfThree(self, n):
        """
        :type n: int
        :rtype: bool
        """
        # the pow(3, 19) < pow(2, 31) - 1 < pow(3, 20)
        return n > 0 and pow(3, 19) % n == 0