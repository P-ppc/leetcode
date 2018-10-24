class Solution(object):
    def decodeString(self, s):
        """
        :type s: str
        :rtype: str
        """
        stack = []
        for c in s:
            if c == ']':
                temp_str = ''
                while len(stack) > 0 and stack[-1] != '[':
                    temp_str = stack.pop() + temp_str
                stack.pop()
                
                temp_int = ''
                while len(stack) > 0 and stack[-1].isdigit():
                    temp_int = stack.pop() + temp_int
                
                stack.append(int(temp_int) * temp_str)
            else:
                stack.append(c)
                
        return ''.join(stack)