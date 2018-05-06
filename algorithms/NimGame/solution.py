class Solution(object):
    def canWinNim(self, n):
        """
        :type n: int
        :rtype: bool
        """
        # if the result of n % 4 != 0, you can remove the number of result, then you can win
        return n % 4 != 0