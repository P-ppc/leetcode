class Solution(object):
    def scoreOfParentheses(self, S):
        """
        :type S: str
        :rtype: int
        """
        stack = []
        
        for c in S:
            if c == '(':
                stack.append(c)
            elif stack[-1] == '(':
                stack[-1] = 1
            else:
                stack[-2] = 2 * stack[-1]
                stack.pop()
            
            v = 0
            while len(stack) > 0 and stack[-1] != '(':
                v += stack.pop()
            if v > 0:
                stack.append(v)
                    
        return 0 if len(stack) == 0 else stack[0]