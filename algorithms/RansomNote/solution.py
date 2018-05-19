class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        character_map = {}
        for c in magazine:
            if character_map.get(c) != None:
                character_map[c] += 1
            else:
                character_map[c] = 1
                
        for c in ransomNote:
            if character_map.get(c) == None or character_map.get(c) == 0:
                return False
            else:
                character_map[c] -= 1
        return True
        