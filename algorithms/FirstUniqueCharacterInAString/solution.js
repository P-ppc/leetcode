/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    let characterMap = {}
    
    for (let i = 0; i < s.length; i++) {
        let c = s[i]
        if (characterMap[c] === undefined) {
            characterMap[c] = 1
        } else {
            characterMap[c]++
        }
    }
    
    for (let i = 0; i < s.length; i++) {
        if (characterMap[s[i]] === 1) {
            return i
        }
    }
    
    return -1
};