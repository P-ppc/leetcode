/**
 * @param {string} A
 * @param {string} B
 * @return {boolean}
 */
var buddyStrings = function(A, B) {
    if (A.length !== B.length) return false
    
    if (A === B) {
        let characterMap = {}
        for (let i = 0; i < A.length; i++) {
            if (characterMap[A[i]] === undefined) {
                characterMap[A[i]] = true
            } else {
                return true
            }
        }
        return false
    } else {
        let diffs = []
        for (let i = 0; i < A.length; i++) {
            if (A[i] !== B[i]) {
                diffs.push(A[i])
                diffs.push(B[i])
            }            
        }
        if (diffs.length === 4 && diffs[0] === diffs[3] && diffs[1] == diffs[2]) return true
        return false
    }
};
