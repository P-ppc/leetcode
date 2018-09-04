/**
 * @param {number} num
 * @return {number[]}
 */
var countBits = function(num) {
    let dp = [0, 1]
    
    for (let i = 2; i <= num; i++) {
        if (i % 2 == 0) {
            dp.push(dp[i >> 1])
        } else {
            dp.push(dp[i - 1] + 1)
        }
    }
    
    return dp.slice(0, num + 1)
};