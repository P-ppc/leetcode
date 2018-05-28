class Solution(object):
    def countBinarySubstrings(self, s):
        """
        :type s: str
        :rtype: int
        """
        zero_count = 0
        one_count = 0
        last_character = None
        
        count = 0
        
        for c in s:
            if c == '0':
                if last_character != '0':
                    zero_count = 1
                else:
                    zero_count += 1
                if zero_count <= one_count:
                    count += 1
            if c == '1':
                if last_character != '1':
                    one_count = 1
                else:
                    one_count += 1
                if one_count <= zero_count:
                    count += 1
            last_character = c
            
        return count