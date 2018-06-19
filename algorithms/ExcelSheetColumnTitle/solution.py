class Solution(object):
    def convertToTitle(self, n):
        """
        :type n: int
        :rtype: str
        """
        res = ''
        
        while n > 0:
            mod = n % 26
            n /= 26
            
            if mod == 0:
                n -= 1
                mod = 26
            res = chr(mod + 64) + res
            
        return res