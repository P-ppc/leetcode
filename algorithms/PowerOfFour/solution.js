/**
 * @param {number} num
 * @return {boolean}
 */
var isPowerOfFour = function(num) {
    if (num <= 0 || (num & num - 1) !== 0) {
        return false
    }
    return (0X55555555 & num) === num
};