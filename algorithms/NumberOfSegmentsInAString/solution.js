/**
 * @param {string} s
 * @return {number}
 */
var countSegments = function(s) {
    let count = 0,
        prev = null
        
    for (let i = 0; i < s.length; i++) {
        let c = s[i]

        if (c === ' ' && prev !== null && prev !== ' ') {
            count++
        }
        prev = c
    }

    if (prev !== null && prev !== ' ') {
        count++
    }

    return count
};