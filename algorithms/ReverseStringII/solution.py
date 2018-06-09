class Solution(object):
    def reverseStr(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        res = list(s)
        i = 0
        while i < len(s):
            if i % (2 * k) == 0:
                start = i
                end = i + k - 1
                if end >= len(s):
                    end = len(s) - 1
                while start < end:
                    res[start], res[end] = res[end], res[start]
                    start += 1
                    end -= 1
                    
                i = end + 1
            else:
                i += 1
        
        return ''.join(res)