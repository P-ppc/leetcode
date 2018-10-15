class Solution(object):
    def minAddToMakeValid(self, S):
        """
        :type S: str
        :rtype: int
        """
        stack = []
        
        for c in S:
            if c == ')' and len(stack) > 0 and stack[-1] == '(':
                stack.pop()
            else:
                stack.append(c)
            
        return len(stack)