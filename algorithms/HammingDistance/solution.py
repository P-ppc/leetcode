class Solution(object):
    def hammingDistance(self, x, y):
        """
        :type x: int
        :type y: int
        :rtype: int
        """
        count = 0
        # different binary will be 1
        x = x ^ y
        while x != 0:
            # 1 or 0x01 or 0b00000001
            # if the last bit is 1
            if x & 0x01 == 1:
                count += 1
            # move right 1 bit
            x = x >> 1
        return count
        