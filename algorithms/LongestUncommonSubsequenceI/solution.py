class Solution(object):
    def findLUSlength(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: int
        """
        res = -1
        if len(a) != len(b):
            res = max(len(a), len(b))
        elif a != b:
            res = len(a)
        return res