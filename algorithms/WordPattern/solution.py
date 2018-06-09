class Solution(object):
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        words_map = {}
        p_map = {}
        
        words = str.split(' ')
        if len(words) != len(pattern):
            return False
        
        for i in range(len(words)):
            word = words[i]
            p = pattern[i]
            if words_map.get(word) == None and p_map.get(p) == None:
                words_map[word] = p
                p_map[p] = word
            elif words_map.get(word) != p or p_map.get(p) != word:
                return False
        return True