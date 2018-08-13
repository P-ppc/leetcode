/**
 * @param {number} n
 * @param {number} k
 * @return {string}
 */
var getPermutation = function(n, k) {
    let res = '',
        candidates = []
    
    for (let i = 1; i <= n; i++) {
        candidates.push(i)
    }
    
    k = k - 1
    while (candidates.length > 1) {
        n -= 1
        let x = factorial(n),
            quotient = parseInt(k / x)
        k = k % x
        res += candidates[quotient]
        candidates.splice(quotient, 1)
    }
    res += candidates[0]
    return res
};

var factorial = function (n) {
    let res = 1
    for (let i = 1; i <= n; i++) {
        res *= i
    }
    return res
};
