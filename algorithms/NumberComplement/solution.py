class Solution(object):
    def findComplement(self, num):
        """
        :type num: int
        :rtype: int
        """
        # use this v to ^
        x = 1
        while x <= num:
            num = num ^ x
            # move left 1 bit
            x = x << 1
        return num