/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    let characterMap = {}
    for (let i = 0; i < magazine.length; i++) {
        let c = magazine[i]
        if (characterMap[c] !== undefined) {
            characterMap[c] += 1
        } else {
            characterMap[c] = 1
        }
    }
    
    for (let i = 0; i < ransomNote.length; i++) {
        let c = ransomNote[i]
        if (characterMap[c] === undefined || characterMap[c] === 0) {
            return false
        } else {
            characterMap[c] -= 1
        }
    }
    
    return true
};