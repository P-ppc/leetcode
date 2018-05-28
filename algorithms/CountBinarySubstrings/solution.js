/**
 * @param {string} s
 * @return {number}
 */
var countBinarySubstrings = function(s) {
    let zeroCount = 0,
        oneCount = 0,
        count = 0,
        lastCharacter = null
    
    s.split('').forEach(c => {
        if (c === '0') {
            if (lastCharacter != '0') {
                zeroCount = 1
            } else {
                zeroCount += 1
            }
            if (zeroCount <= oneCount) {
                count += 1
            }
        } else if (c === '1') {
            if (lastCharacter != '1') {
                oneCount = 1
            } else {
                oneCount += 1
            }
            if (oneCount <= zeroCount) {
                count += 1
            }
        }
        lastCharacter = c
    })
    return count
};