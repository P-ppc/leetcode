/**
 * @param {string} paragraph
 * @param {string[]} banned
 * @return {string}
 */
var mostCommonWord = function(paragraph, banned) {
    let wordsMap = {},
        words = [],
        res = null,
        maxCount = 0
    
    paragraph = paragraph.toLowerCase()
    paragraph = paragraph.replace(/[!?',;.]/g, '')
    banned = banned.map(b => b.toLowerCase())
    
    paragraph.split(' ').forEach(word => {
        if (wordsMap[word] === undefined) {
            wordsMap[word] = 1
            words.push(word)
        } else {
            wordsMap[word]++
        }
    })
    
    words.forEach(word => {
        if (banned.findIndex(b => b === word) === -1 && wordsMap[word] > maxCount) {
            res = word
            maxCount = wordsMap[word]
        }
    })
    return res
};