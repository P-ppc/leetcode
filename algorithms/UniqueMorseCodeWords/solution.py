class Solution(object):
    def uniqueMorseRepresentations(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        check_list = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        translated_set = set()
        for word in words:
            translated_str = ''
            for char in word:
                translated_str += check_list[ord(char) - ord('a')]
            translated_set.add(translated_str)
        return len(translated_set)