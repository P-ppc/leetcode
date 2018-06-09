class Solution(object):
    def mostCommonWord(self, paragraph, banned):
        """
        :type paragraph: str
        :type banned: List[str]
        :rtype: str
        """
        words_map = {}
        words = []
        paragraph = paragraph.lower()
        paragraph = re.sub(r"[!?',;.]", '', paragraph)
        
        for i in range(len(banned)):
            banned[i] = banned[i].lower()
        
        for word in paragraph.split(' '):
            if words_map.get(word) == None:
                words_map[word] = 1
                words.append(word)
            else:
                words_map[word] += 1
                
        res = None
        max_count = 0
        for word in words:
            if word not in banned and words_map[word] > max_count:
                res = word
                max_count = words_map[word]
        
        return res