/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
    let res = '',
        carry = 0,
        i = a.length - 1,
        j = b.length - 1
    
    while (i >= 0 || j >= 0) {
        let x = i >= 0 ? a[i] - '0' : 0,
            y = j >= 0 ? b[j] - '0' : 0,
            sum = x + y + carry
        
        res = String(sum % 2) + res
        carry = parseInt(sum / 2)
        i--
        j--
    }
    
    return carry ? '1' + res : res
};