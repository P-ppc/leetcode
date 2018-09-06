class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        
        m = len(matrix)
        if m == 0:
            return []
        n = len(matrix[0])
        
        res = []
        i = j = 0
        top_limit = left_limit = 0
        bottom_limit = m - 1
        right_limit = n - 1
        
        x_direction = 1
        y_direction = 0
        
        for c in xrange(m * n):
            res.append(matrix[i][j])
            
            if j + x_direction > right_limit:
                top_limit = i + 1
                x_direction = 0
                y_direction = 1
            elif i + y_direction > bottom_limit:
                right_limit = j - 1
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
        
        return res