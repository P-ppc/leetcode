/**
 * @param {number[]} A
 * @return {number}
 */
var peakIndexInMountainArray = function(A) {
    let cur = null
    
    for (let i = 0; i < A.length; i++) {
        if (cur === null || cur < A[i]) {
            cur = A[i]
        } else {
            return i - 1
        }
    }
};