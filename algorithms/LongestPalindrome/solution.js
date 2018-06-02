/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    let appearedMap = {},
        count = 0
    
    s.split('').forEach(c => {
        if (appearedMap[c] === undefined) {
            appearedMap[c] = 1
        } else {
            count += 2
            delete appearedMap[c]
        }
    })
    
    if (s.length > count) {
        count++
    }
    
    return count
};