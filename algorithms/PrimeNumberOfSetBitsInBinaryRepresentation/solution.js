/**
 * @param {number} L
 * @param {number} R
 * @return {number}
 */
var countPrimeSetBits = function(L, R) {
    let count = 0
    
    for (let i = L; i <= R; i++) {
        let oneCount = 0, x = i
        while (x !== 0) {
            x &= x - 1
            oneCount++
        }
        
        if (oneCount !== 1) {
            let x = parseInt(oneCount / 2),
                isPrime = true
            while (x > 1) {
                if (oneCount % x === 0) {
                    isPrime = false
                    break
                } else {
                    x--
                }
            }
            if (isPrime) count++
        }
    }
    
    return count
};