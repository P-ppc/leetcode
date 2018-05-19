class Solution(object):
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        res = '1'
        for i in range(1, n):
            temp = ''
            stack = ''
            for c in res:
                if len(stack) > 0 and stack[-1] != c:
                    temp += str(len(stack)) + stack[-1]
                    stack = c
                else:
                    stack += c
            if len(stack) > 0:
                temp += str(len(stack)) + stack[-1]
            res = temp
        return res