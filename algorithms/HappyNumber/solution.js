/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    let sumMap = { n: true }
    
    while (n !== 1) {
        let sum = 0
        while (n >= 10) {
            sum += Math.pow(n % 10, 2)
            n = parseInt(n / 10)
        }
        sum += Math.pow(n, 2)
        n = sum
        
        if (sumMap[sum] !== undefined) {
            return false
        } else {
            sumMap[sum] = true
        }
    }
    
    return true    
};