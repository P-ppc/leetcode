class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if needle == '':
            return 0
    
        nxt = []
        i = j = 0
        
        while i < len(needle):
            if i == 0 or (needle[i] != needle[j] and j == 0):
                nxt.append(0)
            elif needle[i] == needle[j]:
                nxt.append(j + 1)
                j += 1
            elif needle[i] != needle[j] and j > 0:
                j = nxt[j - 1]
                continue
            i += 1
        
        i = j = 0
        
        while i < len(haystack) and j < len(needle):
            if haystack[i] == needle[j]:
                i += 1
                j += 1
            elif j == 0:
                i += 1
            else:
                j = nxt[j - 1]
        
        return i - j if j == len(needle) else -1
