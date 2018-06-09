class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s) == 0:
            return True
        
        i = 0
        j = len(s) - 1
        
        while i < j:
            start = s[i]
            end = s[j]
            if not ('a' <= start <= 'z' or 'A' <= start <= 'Z' or '0' <= start <= '9'):
                i += 1
            elif not ('a' <= end <= 'z' or 'A' <= end <= 'Z' or '0' <= end <= '9'):
                j -= 1
            elif start.lower() == end.lower():
                i += 1
                j -= 1
            else:
                return False
            
        return True