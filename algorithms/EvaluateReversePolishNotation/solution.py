class Solution(object):
    def evalRPN(self, tokens):
        """
        :type tokens: List[str]
        :rtype: int
        """
        stack = []
        
        for token in tokens:
            if token in ['+', '-', '*', '/']:
                value2 = int(stack.pop())
                value1 = int(stack.pop())
                value = 0
                if token == '+':
                    value = value1 + value2
                elif token == '-':
                    value = value1 - value2
                elif token == '*':
                    value = value1 * value2
                elif token == '/':
                    value = int(value1 * 1.0 / value2)
                stack.append(value)
            else:
                stack.append(token)
        
        return 0 if len(stack) == 0 else int(stack[0])