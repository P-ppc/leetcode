class Solution(object):
    def hasAlternatingBits(self, n):
        """
        :type n: int
        :rtype: bool
        """
        flag = None
        while n > 0:
            res = n & 0x01
            n >>= 1
            if flag is None or flag != res:
                flag = res
            else:
                return False
            
        return True