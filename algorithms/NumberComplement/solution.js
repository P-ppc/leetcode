/**
 * @param {number} num
 * @return {number}
 */
var findComplement = function(num) {
    x = 1
    while (x <= num && x >= 0) {
        num = num ^ x
        x = x << 1
    }
    return num
};