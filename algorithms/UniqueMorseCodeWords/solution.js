/**
 * @param {string[]} words
 * @return {number}
 */
var uniqueMorseRepresentations = function(words) {
    let checkList = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
    let translatedSet = new Set()
    words.forEach(word => {
        let translatedStr = ''
        word.split('').forEach(char => {
            translatedStr += checkList[char.charCodeAt() - 'a'.charCodeAt()]
        })
        translatedSet.add(translatedStr)
    })
    return translatedSet.size
};