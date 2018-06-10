class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        character_map = {}
        
        for c in s:
            if character_map.get(c) == None:
                character_map[c] = 1
            else:
                character_map[c] += 1
        
        for i in range(len(s)):
            if character_map[s[i]] == 1:
                return i
        
        return -1