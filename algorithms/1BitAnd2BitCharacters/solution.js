/**
 * @param {number[]} bits
 * @return {boolean}
 */
var isOneBitCharacter = function(bits) {
    let index = 0
    
    while (index < bits.length) {
        if (bits[index] === 1) {
            if (index + 2 === bits.length) {
                return false
            } else {
                index += 2
            }
        } else {
            index++
        }
    }
    
    return true
};