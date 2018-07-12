class Solution(object):
    def numMagicSquaresInside(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        res = 0
        row_length = len(grid)
        col_length = len(grid[0])
        
        matrix_base = []
        for i in range(row_length):
            for j in range(col_length):
                if i + 2 < row_length and j + 2 < col_length:
                    matrix_base.append([i, j])
        
        for base in matrix_base:
            if self.isMagicSquare(base, grid):
                res += 1
        return res
    
    
    def isMagicSquare(self, base, grid):
        # the sum is 15
        # avoid repeat
        value_map = {}
        for i in range(base[0], base[0] + 3):
            for j in range(base[1], base[1] + 3):
                if value_map.get(grid[i][j]) != None or not 1 <= grid[i][j] <= 9:
                    return False
                value_map[grid[i][j]] = True
                
        if grid[base[0]][base[1]] + grid[base[0]][base[1] + 1] + grid[base[0]][base[1] + 2] != 15:
            return False
        elif grid[base[0] + 1][base[1]] + grid[base[0] + 1][base[1] + 1] + grid[base[0] + 1][base[1] + 2] != 15:
            return False
        elif grid[base[0] + 2][base[1]] + grid[base[0] + 2][base[1] + 1] + grid[base[0] + 2][base[1] + 2] != 15:
            return False
        elif grid[base[0]][base[1]] + grid[base[0] + 1][base[1]] + grid[base[0] + 2][base[1]] != 15:
            return False
        elif grid[base[0]][base[1] + 1] + grid[base[0] + 1][base[1] + 1] + grid[base[0] + 2][base[1] + 1] != 15:
            return False
        elif grid[base[0]][base[1] + 2] + grid[base[0] + 1][base[1] + 2] + grid[base[0] + 2][base[1] + 2] != 15:
            return False
        elif grid[base[0]][base[1]] + grid[base[0] + 1][base[1] + 1] + grid[base[0] + 2][base[1] + 2] != 15:
            return False
        elif grid[base[0]][base[1] + 2] + grid[base[0] + 1][base[1] + 1] + grid[base[0] + 2][base[1]] != 15:
            return False
        
        return True