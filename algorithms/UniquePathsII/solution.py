class Solution(object):
    def uniquePathsWithObstacles(self, obstacleGrid):
        """
        :type obstacleGrid: List[List[int]]
        :rtype: int
        """
        m = len(obstacleGrid)
        n = len(obstacleGrid[0]) if m > 0 else 0
        if m == 0 or n == 0:
            return 0
        
        dp = []
        for i in xrange(m):
            row = [0] * n
            dp.append(row)
        
        dp[0][0] = 1 if obstacleGrid[0][0] == 0 else 0
        
        for i in xrange(m):
            for j in xrange(n):
                if obstacleGrid[i][j] == 0:
                    dp[i][j] += (dp[i - 1][j] if i > 0 else 0) + (dp[i][j - 1] if j > 0 else 0)
        
        return dp[m - 1][n - 1]