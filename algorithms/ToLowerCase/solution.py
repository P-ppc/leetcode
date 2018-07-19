class Solution(object):
    def toLowerCase(self, str):
        """
        :type str: str
        :rtype: str
        """
        res = ''
        
        for c in str:
            if 'A' <= c <= 'Z':
                res += chr(ord(c) + 32)
            else:
                res += c
        
        return res