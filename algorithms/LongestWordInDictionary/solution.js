/**
 * @param {string[]} words
 * @return {string}
 */
var longestWord = function(words) {
    let longestWord = null,
        wordsMap = {}
    
    words.sort().forEach(word => {
        if (word.length === 1 || wordsMap[word.slice(0, word.length - 1)]) {
            wordsMap[word] = true
            if (!longestWord || word.length > longestWord.length) {
                longestWord = word
            }
        }
    })
    return longestWord
};