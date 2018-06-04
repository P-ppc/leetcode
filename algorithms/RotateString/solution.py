class Solution(object):
    def rotateString(self, A, B):
        """
        :type A: str
        :type B: str
        :rtype: bool
        """
        if len(A) != len(B):
            return False
        
        i = 0
        while i <= len(A):
            if A == B:
                return True
            A = A[1:] + A[0]
            i += 1
            
        return False