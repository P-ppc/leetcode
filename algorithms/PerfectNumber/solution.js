/**
 * @param {number} num
 * @return {boolean}
 */
var checkPerfectNumber = function(num) {
    if (num <= 1) return false
    
    let factorSum = 1
    for (let i = 2; i < Math.sqrt(num); i++) {
        if (num % i === 0) factorSum += i + num / i
    }
    
    return factorSum === num
};