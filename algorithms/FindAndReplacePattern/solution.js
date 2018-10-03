/**
 * @param {string[]} words
 * @param {string} pattern
 * @return {string[]}
 */
var findAndReplacePattern = function(words, pattern) {
    let res = [],
        length = pattern.length
    
    words.forEach(word => {
        let charMap = {},
            charReverseMap = {},
            notMatch = false
        
        for (let i = 0; i < length; i++) {
            if (!charMap[word[i]] && !charReverseMap[pattern[i]]) {
                charMap[word[i]] = pattern[i]
                charReverseMap[pattern[i]] = word[i]
            } else if (charMap[word[i]] != pattern[i]) {
                notMatch = true
                break
            }
        }
        if (!notMatch)
            res.push(word)
    })
    
    return res
};