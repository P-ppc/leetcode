class Solution(object):
    def findAndReplacePattern(self, words, pattern):
        """
        :type words: List[str]
        :type pattern: str
        :rtype: List[str]
        """
        res = []
        word_length = len(pattern)
        
        for word in words:
            char_map = {}
            char_reverse_map = {}
            not_match = False
            
            for i in xrange(word_length):
                if not char_map.get(word[i]) and not char_reverse_map.get(pattern[i]):
                    char_map[word[i]] = pattern[i]
                    char_reverse_map[pattern[i]] = word[i]
                elif char_map.get(word[i]) != pattern[i]:
                    # same as char_reverse_map.get(pattern[i]) != word[i]
                    not_match = True
                    break
                    
            if not not_match:
                res.append(word)
        
        return res