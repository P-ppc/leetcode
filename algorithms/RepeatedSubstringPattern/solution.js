/**
 * @param {string} s
 * @return {boolean}
 */
var repeatedSubstringPattern = function(s) {
    let i = j = 0,
        next = []
    
    while (i < s.length) {
        if (i === 0 || (s[i] !== s[j] && j === 0)) {
            next.push(0)
        } else if (s[i] === s[j]) {
            next.push(j + 1)
            j++
        } else if (s[i] !== s[j]) {
            j = next[j - 1]
            continue
        }
        i++
    }
    
    let subLength = s.length - next[s.length - 1]
    return subLength !== s.length && s.length % subLength === 0
};