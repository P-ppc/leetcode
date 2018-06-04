class Solution(object):
    def toHex(self, num):
        """
        :type num: int
        :rtype: str
        """
        if num == 0:
            return '0'
        
        if num < 0:
            num = (-num ^ 0xffffffff) + 1
        res = ''
        while num > 0:
            mod = num % 16
            if mod >= 10:
                res = chr(mod + 87) + res
            else:
                res = str(mod) + res
            num = num / 16
        return res
