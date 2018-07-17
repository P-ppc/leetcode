/**
 * @param {number} num
 * @return {string}
 */
var intToRoman = function(num) {
    let values = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1],
        keys = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I'],
        res = ''
    
    values.forEach((value, i) => {
        let temp = parseInt(num / value)
        num %= value
        while (temp-- > 0) {
            res += keys[i]
        }
    })
    
    return res
};