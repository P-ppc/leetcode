/**
 * @param {string} A
 * @param {string} B
 * @return {number}
 */
var repeatedStringMatch = function(A, B) {
    let lengthA = A.length,
        lengthB = B.length,
        i = j = 0,
        next = []
    
    while (i < lengthB) {
        if (i === 0 || (B[i] !== B[j] && j === 0)) {
            next.push(0)
        } else if (B[i] === B[j]) {
            next.push(++j)
        } else if (B[i] !== B[j] && j > 0) {
            j = next[j - 1]
            continue
        }
        i++
    }
    
    i = j = 0
    while (j < lengthB) {
        if (A[i % lengthA] === B[j]) {
            i++
            j++
        } else if (j === 0) {
            i++
        } else if (j > 0) {
            j = next[j - 1]
        }
        
        if (i >= lengthA + lengthB) {
            return -1
        }
    }
    
    return i % lengthA > 0 ? parseInt(i / lengthA) + 1 : parseInt(i / lengthA)
};