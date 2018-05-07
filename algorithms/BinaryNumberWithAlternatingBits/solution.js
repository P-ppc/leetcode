/**
 * @param {number} n
 * @return {boolean}
 */
var hasAlternatingBits = function(n) {
    let flag = null
    while (n > 0) {
        res = n & 0x01
        n >>= 1
        if (flag === null || flag !== res) {
            flag = res
        } else {
            return false
        }
    }
    return true
};