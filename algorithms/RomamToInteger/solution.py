class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        res = 0
        stack = ''
        for c in s:
            stack += c
            if stack == 'IV':
                res += 4
                stack = ''
            elif stack == 'IX':
                res += 9
                stack = ''
            elif stack == 'XL':
                res += 40
                stack = ''
            elif stack == 'XC':
                res += 90
                stack = ''
            elif stack == 'CD':
                res += 400
                stack = ''
            elif stack == 'CM':
                res += 900
                stack = ''
            elif len(stack) == 2:
                c = stack[0]
                if c == 'I':
                    res += 1
                elif c == 'V':
                    res += 5
                elif c == 'X':
                    res += 10
                elif c == 'L':
                    res += 50
                elif c == 'C':
                    res += 100
                elif c == 'D':
                    res += 500
                elif c == 'M':
                    res += 1000
                stack = stack[1]
        if stack == 'I':
            res += 1
        elif stack == 'V':
            res += 5
        elif stack == 'X':
            res += 10
        elif stack == 'L':
            res += 50
        elif stack == 'C':
            res += 100
        elif stack == 'D':
            res += 500
        elif stack == 'M':
            res += 1000
            
        return res