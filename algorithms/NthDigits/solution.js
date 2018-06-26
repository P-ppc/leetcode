/**
 * @param {number} n
 * @return {number}
 */
var findNthDigit = function(n) {
    let preCount = 0,
        count = 0,
        i = 0,
        preNumCount = 0
    
    while (count < n) {
        if (i > 0) {
            preNumCount += 9 * Math.pow(10, i - 1)
        }
        preCount = count
        count += 9 * Math.pow(10, i) * (i + 1)
        i++
    }
    
    let diff = (n - preCount) % i,
        targetNum = preNumCount + (diff === 0 ?  + (n - preCount) / i : (n - preCount) / i + 1)
    
    return parseInt(String(targetNum)[diff === 0 ? i - 1 : diff - 1])
};