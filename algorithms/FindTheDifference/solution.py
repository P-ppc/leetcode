class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        res = 0
        s = s + t
        for c in s:
            res ^= ord(c)
        return chr(res)