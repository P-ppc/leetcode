class Solution(object):
    def validPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        i = 0
        j = len(s) - 1
        mark_i = 0
        mark_j = 0
        left_skip = False
        right_skip = False
        
        while i < j:
            if s[i] == s[j]:
                i += 1
                j -= 1
            elif not left_skip:
                mark_i = i
                mark_j = j
                i += 1
                left_skip = True
            elif not right_skip:
                i = mark_i
                j = mark_j
                j -= 1
                right_skip = True
            else:
                return False
            
        return True