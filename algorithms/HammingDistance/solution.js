/**
 * @param {number} x
 * @param {number} y
 * @return {number}
 */
var hammingDistance = function(x, y) {
    let count = 0
    x = x ^ y
    while (x > 0) {
        if ((x & 0b00000001) === 1) {
            count++
        }
        x = x >> 1
    }
    return count
};