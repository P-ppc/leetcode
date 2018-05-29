/**
 * @param {string} s
 * @return {boolean}
 */
var checkRecord = function(s) {
    let aStack = [],
        lStack = [],
        lastCharacter = null
    
    for (let i = 0; i < s.length; i++) {
        let c = s[i]
        
        if (c === 'A') {
            aStack.push(c)
        } else if (c === 'L') {
            if (lastCharacter !== c) {
                lStack = [c]
            } else {
                lStack.push(c)
            }
        }
        
        if (aStack.length > 1 || lStack.length > 2) {
            return false
        }
        
        lastCharacter = c
    }
    
    return true
};