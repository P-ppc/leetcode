/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    let res = [],
        carry = 1
    
    digits.reverse().forEach(d => {
        let sum = d + carry
        res.unshift(sum % 10)
        carry = parseInt(sum / 10)
    })
    
    if (carry === 1) res.unshift(1)
    
    return res
};