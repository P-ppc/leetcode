/**
 * @param {number} n
 * @return {number}
 */
var trailingZeroes = function(n) {
    let count = 0,
        step = 5
    
    while (step <= n) {
        count += parseInt(n / step)
        step *= 5
    }
    
    return count
};