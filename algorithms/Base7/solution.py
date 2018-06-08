class Solution(object):
    def convertToBase7(self, num):
        """
        :type num: int
        :rtype: str
        """
        res = ''
        is_negative = False
        
        if num == 0:
            res = '0'
        if num < 0:
            num = -num
            is_negative = True
        while num > 0:
            res = str(num % 7) + res
            num = num / 7
        return '-' + res if is_negative else res