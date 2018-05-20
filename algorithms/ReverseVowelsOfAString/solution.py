class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        vowels = ['a', 'e', 'i', 'o', 'u']
        
        s = list(s)
        start = 0
        end = len(s) - 1
        while start < end:
            if s[start].lower() in vowels:
                while s[end].lower() not in vowels and start < end:
                    end -= 1
                if start == end:
                    break
                else:
                    s[start], s[end] = s[end], s[start]
                    start += 1
                    end -= 1
            else:
                start += 1
        return ''.join(s)