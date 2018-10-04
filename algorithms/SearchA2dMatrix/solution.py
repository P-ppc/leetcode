class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        m = len(matrix)
        n = 0 if m == 0 else len(matrix[0])
        if m == 0 or n == 0:
            return False
        
        low = 0
        high = m - 1
        row_index = -1
        while low <= high:
            mid = (low + high) / 2
            if matrix[mid][n - 1] < target:
                low = mid + 1
            elif matrix[mid][0] > target:
                high = mid - 1
            else:
                row_index = mid
                break
        if row_index == -1:
            return False
        
        low = 0
        high = n - 1
        while low <= high:
            mid = (low + high) / 2
            if matrix[row_index][mid] < target:
                low = mid + 1
            elif matrix[row_index][mid] > target:
                high = mid - 1
            else:
                return True
        
        return False