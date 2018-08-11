class Solution(object):
    def __init__(self):
        self.digits_map = [
            'abc',
            'def',
            'ghi',
            'jkl',
            'mno',
            'pqrs',
            'tuv',
            'wxyz'
        ]
    
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        res = []
        if digits != '':
            self.backtrack(0, digits, '', res)
        return res
    
    def backtrack(self, beg, digits, temp, res):
        if beg == len(digits):
            res.append(temp)
        else:
            characters = self.digits_map[int(digits[beg]) - 2]
            for c in characters:
                t = temp + c
                self.backtrack(beg + 1, digits, t, res)
            