/**
 * @param {number} n
 * @return {number[]}
 */
var grayCode = function(n) {
    let res = [],
        length = 1 << n
    for (let i = 0; i < length; i++) {
        res.push(i ^ (i >> 1))
    }
    return res
};