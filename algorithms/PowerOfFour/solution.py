class Solution(object):
    def isPowerOfFour(self, num):
        """
        :type num: int
        :rtype: bool
        """
        # not the power of two
        if num <= 0 or num & num - 1 != 0:
            return False
        return 0X55555555 & num == num