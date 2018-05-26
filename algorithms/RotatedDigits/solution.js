/**
 * @param {number} N
 * @return {number}
 */
var rotatedDigits = function(N) {
    let count = 0
    
    for (let i = 0; i < N + 1; i++) {
        if (String(i).match(/[347]/) === null && String(i).match(/[2569]/) !== null) count++
    }
    return count
};