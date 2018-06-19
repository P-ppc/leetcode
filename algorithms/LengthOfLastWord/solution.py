class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        length = 0
        prev_length = 0
        
        for c in s:
            if c == ' ':
                if length != 0:
                    prev_length = length
                length = 0
            else:
                length += 1
        
        return length if length != 0 else prev_length