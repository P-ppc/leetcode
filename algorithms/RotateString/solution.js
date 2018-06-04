/**
 * @param {string} A
 * @param {string} B
 * @return {boolean}
 */
var rotateString = function(A, B) {
    if (A.length !== B.length) return false
    
    let i = 0
    while (i <= A.length) {
        if (A === B) return true
        A = A.substr(1) + A.substr(0, 1)
        i++
    }
    
    return false
};