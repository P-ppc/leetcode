class Solution(object):
    def checkRecord(self, s):
        """
        :type s: str
        :rtype: bool
        """
        a_stack = []
        l_stack = []
        last_character = None
        
        for c in s:
            if c == 'A':
                a_stack.append(c)
            elif c == 'L':
                if last_character != 'L':
                    l_stack = [c]
                else:
                    l_stack.append(c)
            
            if len(a_stack) > 1 or len(l_stack) > 2:
                return False
            last_character = c
            
        return True