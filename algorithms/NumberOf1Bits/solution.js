/**
 * @param {number} n - a positive integer
 * @return {number}
 */
var hammingWeight = function(n) {
    let res = 0
    while (n > 0) {
        if (n & 0x01 === 1) {
            res += 1
        } 
        n >>>= 1
    }
    return res
};