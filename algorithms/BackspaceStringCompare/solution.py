class Solution(object):
    def backspaceCompare(self, S, T):
        """
        :type S: str
        :type T: str
        :rtype: bool
        """
        s_stack = []
        t_stack = []
        
        for c in S:
            if c != '#':
                s_stack.append(c)
            elif len(s_stack) > 0:
                s_stack.pop()
                
        for c in T:
            if c != '#':
                t_stack.append(c)
            elif len(t_stack) > 0:
                t_stack.pop()
        return ''.join(s_stack) == ''.join(t_stack)