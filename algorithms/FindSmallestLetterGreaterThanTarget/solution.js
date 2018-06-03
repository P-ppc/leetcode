/**
 * @param {character[]} letters
 * @param {character} target
 * @return {character}
 */
var nextGreatestLetter = function(letters, target) {
    let index = 0
    
    while (index < letters.length) {
        if (letters[index] > target) {
            break
        } else {
            index++
        }
    }
    
    if (index === letters.length) {
        index = 0
    }
    
    return letters[index]
};