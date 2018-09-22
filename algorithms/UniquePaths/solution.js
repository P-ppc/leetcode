/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
var uniquePaths = function(m, n) {
    let dp = []
    
    for (let i = 0; i < n; i++) {
        let row = new Array(m)
        row.fill(0)
        dp.push(row)
    }
    
    dp[0][0] = 1
    
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < m; j++)
            dp[i][j] += (i > 0 ? dp[i - 1][j] : 0) + (j > 0 ? dp[i][j - 1] : 0)
    }
    
    return dp[n - 1][m - 1]
};