/**
 * @param {number[][]} obstacleGrid
 * @return {number}
 */
var uniquePathsWithObstacles = function(obstacleGrid) {
    let m = obstacleGrid.length,
        n = m > 0 ? obstacleGrid[0].length : 0
    
    if (m == 0 || n == 0)
        return 0
    
    dp = []
    for (let i = 0; i < m; i++) {
        let row = new Array(n)
        row.fill(0)
        dp.push(row)
    }
    
    dp[0][0] = obstacleGrid[0][0] == 0 ? 1 : 0
    
    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            if (obstacleGrid[i][j] == 0)
                dp[i][j] += (i > 0 ? dp[i - 1][j] : 0) + (j > 0 ? dp[i][j - 1] : 0)
        }
    }
    
    return dp[m - 1][n - 1]
};