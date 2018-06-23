class Solution(object):
    def peakIndexInMountainArray(self, A):
        """
        :type A: List[int]
        :rtype: int
        """
        low = 0
        high = len(A) - 1
        
        while low <= high:
            mid = (low + high) / 2
            
            # in the right part
            if A[mid] < A[mid - 1]:
                high = mid - 1
            # in the left part
            elif A[mid] < A[mid + 1]:
                low = mid + 1
            else:
                return mid
                
            