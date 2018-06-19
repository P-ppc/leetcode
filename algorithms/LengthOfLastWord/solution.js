/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    let length = 0,
        prevLength = 0,
        prevCharacter = null
    
    s.split('').forEach(c => {
        if (c === ' ') {
            if (length !== 0) {
                prevLength = length
            }
            length = 0
        } else if (prevCharacter !== null || prevCharacter !== ' ') {
            length += 1
        }
        prevCharacter = c
    })
    
    return length === 0 ? prevLength : length
};