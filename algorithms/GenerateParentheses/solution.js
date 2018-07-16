/**
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function(n) {
    let res = []
    backTrack('', n, n, res)
    return res
};

var backTrack = function(s, left, right, res) {
    if (left === 0 && right === 0) {
        res.push(s)
        return
    }
    if (left > 0) {
        backTrack(s + '(', left - 1, right, res)
    }
    if (left < right) {
        backTrack(s + ')', left, right - 1, res)
    }    
};