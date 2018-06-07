/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
var addStrings = function(num1, num2) {
    let res = '',
        carry = 0,
        i = num1.length - 1,
        j = num2.length - 1
    
    while (i >= 0 || j >= 0) {
        let a = i >= 0 ? num1[i] - '0' : 0,
            b = j >= 0 ? num2[j] - '0' : 0,
            sum = a + b + carry
        
        res = String(sum % 10) + res
        carry = parseInt(sum / 10)
        i--
        j--
    }
    
    return carry ? '1' + res : res
};