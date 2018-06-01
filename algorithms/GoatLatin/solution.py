class Solution(object):
    def toGoatLatin(self, S):
        """
        :type S: str
        :rtype: str
        """
        res = ''
        
        vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        words = S.split(' ')
        for i in range(len(words)):
            word = words[i]
            
            if len(res) != 0:
                res += ' '
            
            if word[0] not in vowels:
                word = word[1:] + word[0]
            word += 'ma'
            word += 'a' * (i + 1)
            res += word
        
        return res