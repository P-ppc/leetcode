/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
    if (needle === '') return 0
    
    let next = [],
        i = j = 0
    
    while (i < needle.length) {
        if (i === 0 || (needle[i] !== needle[j] && j === 0)) {
            next.push(0)
        } else if (needle[i] === needle[j]) {
            next.push(j + 1)
            j++
        } else if (needle[i] !== needle[j]) {
            j = next[j - 1]
            continue
        }
        i++
    }
    i = j = 0
    
    while (i < haystack.length && j < needle.length) {
        if (haystack[i] == needle[j]) {
            i++
            j++
        } else if (j === 0) {
            i++
        } else {
            j = next[j - 1]
        }
    }
    
    return j === needle.length ? i - j : -1
};