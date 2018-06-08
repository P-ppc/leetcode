/**
 * @param {number} num
 * @return {string}
 */
var convertToBase7 = function(num) {
    let res = '',
        isNegative = false
    
    if (num === 0) {
        res = '0'
    } else {
        if (num < 0) {
            num = -num
            isNegative = true
        }
        
        while (num > 0) {
            res = String(num % 7) + res
            num = parseInt(num / 7)
        }
    }
    
    return isNegative ? '-' + res : res
};