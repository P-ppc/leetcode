/**
 * @param {number[]} A
 * @return {boolean}
 */
var isMonotonic = function(A) {
    let v = 0
    for (let i = 1; i < A.length; i++) {
        if (A[i - 1] > A[i])
            v |= 1
        else if (A[i - 1] < A[i])
            v |= 2
    }
    
    return v != 3
};