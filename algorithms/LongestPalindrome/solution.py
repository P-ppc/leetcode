class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        appeared_map = {}
        count = 0
        
        for c in s:
            if appeared_map.get(c) == None:
                appeared_map[c] = 1
            else:
                count += 2
                del appeared_map[c]
        
        if len(s) > count:
            count += 1
        
        return count