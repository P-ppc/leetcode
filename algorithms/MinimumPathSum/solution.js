/**
 * @param {number[][]} grid
 * @return {number}
 */
var minPathSum = function(grid) {
    let rowCount = grid.length,
        colCount = grid[0].length
    let dp = []
    
    for (let i = 0; i < rowCount; i++) {
        dp.push(new Array(colCount))
        for (let j = 0; j < colCount; j++) {
            if (i === 0 && j === 0) dp[i][j] = grid[i][j]
            else if (i === 0 && j > 0) dp[i][j] = grid[i][j] + dp[i][j - 1]
            else if (i > 0 && j === 0) dp[i][j] = grid[i][j] + dp[i - 1][j]
            else dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1])
        }
    }
    
    return dp[rowCount - 1][colCount - 1]
};