class Solution(object):
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        # convert to division
        prime_list = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        first_line_product = reduce(lambda x, y : x * y, [prime_list[ord(x) - ord('a')] for x in list('qwertyuiop')])
        second_line_product = reduce(lambda x, y : x * y, [prime_list[ord(x) - ord('a')] for x in list('asdfghjkl')])
        last_line_product = reduce(lambda x, y : x * y, [prime_list[ord(x) - ord('a')] for x in list('zxcvbnm')])
        
        result_list = []
        for word in words:
            product = reduce(lambda x, y : x * y, [prime_list[ord(x) - ord('a')] for x in set(word.lower())])
            if first_line_product % product == 0 or second_line_product % product == 0 or last_line_product % product == 0:
                result_list.append(word)
        return result_list
        