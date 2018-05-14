class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        for c in s:
            if len(stack) > 0 and self.match(stack[-1], c):
                stack = stack[: -1]
            else:
                stack.append(c)
        return len(stack) == 0
    
    def match(self, left, right):
        if left == '(' and right == ')':
            return True
        elif left == '[' and right == ']':
            return True
        elif left == '{' and right == '}':
            return True
        return False