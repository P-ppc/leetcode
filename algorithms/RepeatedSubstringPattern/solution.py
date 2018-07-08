class Solution(object):
    def repeatedSubstringPattern(self, s):
        """
        :type s: str
        :rtype: bool
        """
        # method of exhaustion
        for length in range(1, len(s) / 2 + 1):
            if len(s) % length != 0:
                continue
                
            start = 0
            temp = None
            is_equal = True
            while start < len(s):
                p = s[start:start + length]
                if temp == None:
                    temp = p
                elif temp != p:
                    is_equal = False
                    break
                start += length
            if is_equal:
                return True
        return False
