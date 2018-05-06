class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        words = s.split(' ')
        reversed_words = []
        for word in words:
            word_list = list(word)
            word_list.reverse()
            reversed_words.append(''.join(word_list))
        return ' '.join(reversed_words)
        