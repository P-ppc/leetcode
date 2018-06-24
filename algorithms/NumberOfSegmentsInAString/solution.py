class Solution(object):
    def countSegments(self, s):
        """
        :type s: str
        :rtype: int
        """
        count = 0
        prev = None
        
        for c in s:
            if c == ' ' and prev != None and prev != ' ':
                count += 1
            prev = c
        
        if prev != None and prev != ' ':
            count += 1
        
        return count