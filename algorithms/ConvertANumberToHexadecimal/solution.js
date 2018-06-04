/**
 * @param {number} num
 * @return {string}
 */
var toHex = function(num) {
    if (num === 0) {
        return '0'
    }
    
    if (num < 0) {
        // use + replace ^
        // + means - abs of num
        num = 0xffffffff + num + 1
    }
    
    let res = ''
    while (num > 0) {
        let mod = num % 16
        if (mod >= 10) {
            res = String.fromCharCode(mod + 87) + res
        } else {
            res = String(mod) + res
        }
        
        num = parseInt(num / 16)
    }
    
    return res
};