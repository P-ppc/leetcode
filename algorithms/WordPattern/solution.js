/**
 * @param {string} pattern
 * @param {string} str
 * @return {boolean}
 */
var wordPattern = function(pattern, str) {
    let wordsMap = {},
        pMap = {},
        words = str.split(' ')
    
    if (words.length !== pattern.length) {
        return false
    }
    
    for (let i = 0; i < words.length; i++) {
        let word = words[i],
            p = pattern[i]
        
        if (wordsMap[word] === undefined && pMap[p] === undefined) {
            wordsMap[word] = p
            pMap[p] = word
        } else if (wordsMap[word] !== p || pMap[p] !== word) {
            return false
        }
    }
    return true
};