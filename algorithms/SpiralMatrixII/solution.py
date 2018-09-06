class Solution(object):
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """
        matrix = []
        for i in xrange(n):
            matrix.append([0] * n)
        
        i = j = 0
        
        top_limit = left_limit = 0
        bottom_limit = right_limit = n - 1
        
        x_direction = 1
        y_direction = 0
        
        for v in xrange(1, pow(n, 2) + 1):
            matrix[i][j] = v
            
            if j + x_direction > right_limit:
                top_limit = i + 1
                x_direction = 0
                y_direction = 1
            elif i + y_direction > bottom_limit:
                right_limit = i - 1
                x_direction = -1
                y_direction = 0
            elif j + x_direction < left_limit:
                bottom_limit = i - 1
                x_direction = 0
                y_direction = -1
            elif i + y_direction < top_limit:
                left_limit = j + 1
                x_direction = 1
                y_direction = 0
            
            i += y_direction
            j += x_direction
        
        return generateMatrix