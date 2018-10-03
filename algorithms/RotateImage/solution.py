class Solution(object):
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: void Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)
        i = 0
        
        while i < n / 2:
            x = i
            y = i
            
            while y < n - 1 - i:
                matrix[x][y], matrix[y][n - 1 -x] = matrix[y][n - 1 -x], matrix[x][y]
                matrix[x][y], matrix[n - 1 - x][n - 1 - y] = matrix[n - 1 - x][n - 1 - y], matrix[x][y]
                matrix[x][y], matrix[n - 1 - y][x] = matrix[n - 1 - y][x], matrix[x][y]
                y += 1
            
            i += 1