class Solution(object):
    def isMonotonic(self, A):
        """
        :type A: List[int]
        :rtype: bool
        """
        v = 0
        for i in xrange(1, len(A)):
            if A[i - 1] > A[i]:
                v |= 1
            elif A[i - 1] < A[i]:
                v |= 2
        
        return v != 3