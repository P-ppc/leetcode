class Solution(object):
    def simplifyPath(self, path):
        """
        :type path: str
        :rtype: str
        """
        stack = []
        for part in path.split('/'):
            if part != '' and part != '.' and part != '..':
                stack.append(part)
            elif part == '..' and len(stack) > 0:
                stack.pop()
        
        return '/' + '/'.join(stack)