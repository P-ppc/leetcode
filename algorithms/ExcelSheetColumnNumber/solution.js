/**
 * @param {string} s
 * @return {number}
 */
var titleToNumber = function(s) {
    let res = 0
    for (let i = 0; i < s.length; i++) {
        res *= 26
        res += s.charCodeAt(i) - 'A'.charCodeAt(0) + 1
    }
    return res
};