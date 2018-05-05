/**
 * @param {number} left
 * @param {number} right
 * @return {number[]}
 */
var selfDividingNumbers = function(left, right) {
    array = []
    for (let i = left; i <= right; i++) {
        if (isSelfDividingNumber(i)) {
            array.push(i)
        }
    }
    return array
};

var isSelfDividingNumber = function (num) {
    originNum = num
    while (num > 0) {
        mod = num % 10
        if (mod === 0 || originNum % mod !== 0) {
            return false
        }
        num = parseInt(num / 10)
    }
    return true
};