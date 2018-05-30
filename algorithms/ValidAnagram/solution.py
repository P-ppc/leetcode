class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        character_map = {}
        
        # change the order
        if len(s) > len(t):
            s, t = t, s
            
        for c in s:
            if character_map.get(c) == None:
                character_map[c] = 1
            else:
                character_map[c] += 1
        
        for c in t:
            if character_map.get(c) == None or character_map.get(c) == 0:
                return False
            else:
                character_map[c] -= 1
        
        return True