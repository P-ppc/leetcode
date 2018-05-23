class Solution(object):
    def isToeplitzMatrix(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: bool
        """
        for i in range(0, len(matrix)):
            col_length = len(matrix[0])
            for j in range(0, col_length):
                if 0 <= i - 1 and 0 <= j - 1 < col_length and matrix[i][j] != matrix[i - 1][j - 1]:
                    return False
        
        return True                