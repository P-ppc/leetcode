/**
 * @param {string} word
 * @return {boolean}
 */
var detectCapitalUse = function(word) {
    let upperCount = 0,
        lowerCount = 0,
        list = word.split('')
    
    for (let i = 0; i < list.length; i++) {
        if (65 <= list[i].charCodeAt(0) && list[i].charCodeAt(0) <= 90) {
            if (lowerCount > 0) return false
            upperCount += 1
        } else {
            if (upperCount > 1) return false
            lowerCount += 1
        }     
    }

    return true
};