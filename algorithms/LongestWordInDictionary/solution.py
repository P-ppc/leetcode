class Solution(object):
    def longestWord(self, words):
        """
        :type words: List[str]
        :rtype: str
        """
        words.sort()
        
        longest_word = None
        words_map = {}
        
        for word in words:
            if len(word) == 1 or words_map.get(word[:-1]) != None:
                words_map[word] = True
                if not longest_word or len(word) > len(longest_word):
                    longest_word = word
                
        return longest_word
    