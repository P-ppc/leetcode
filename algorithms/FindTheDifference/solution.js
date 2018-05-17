/**
 * @param {string} s
 * @param {string} t
 * @return {character}
 */
var findTheDifference = function(s, t) {
    let res = 0
    s = s + t
    for (let i = 0; i < s.length; i++) res ^= s.charCodeAt(i)
    return String.fromCharCode(res)
};