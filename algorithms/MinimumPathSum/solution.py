class Solution(object):
    def minPathSum(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        row_count = len(grid)
        col_count = len(grid[0])
        
        dp = [[0] * col_count] * row_count
        
        for i in xrange(row_count):
            for j in xrange(col_count):
                if i > 0 and j > 0:
                    dp[i][j] = grid[i][j] + min(dp[i - 1][j], dp[i][j - 1])
                elif i == 0 and j > 0:
                    dp[i][j] = grid[i][j] + dp[i][j - 1]
                elif i > 0 and j == 0:
                    dp[i][j] = grid[i][j] + dp[i - 1][j]
                else:
                    dp[i][j] = grid[i][j]
                    
        return dp[row_count - 1][col_count - 1]