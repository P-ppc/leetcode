/**
 * @param {number} n
 * @return {number}
 */
var countPrimes = function(n) {
    let primes = new Array(Math.max(n, 2)),
        count = 0
    
    primes.fill(true)
    primes[0] = primes[1] = false
    
    for (let i = 2; i < n; i++) {
        if (primes[i]) {
            for (let j = i * 2; j < n; j += i) {
                primes[j] = false
            }
        }
    }
    
    for (let i = 2; i < n; i++) {
        if (primes[i]) {
            count++
        }
    }
    return count
};