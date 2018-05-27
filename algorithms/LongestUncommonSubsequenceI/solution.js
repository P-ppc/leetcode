/**
 * @param {string} a
 * @param {string} b
 * @return {number}
 */
var findLUSlength = function(a, b) {
    let res = -1
    if (a.length != b.length) res = Math.max(a.length, b.length)
    else if (a !== b) res = a.length
    return res
};