/**
 * @param {string} S
 * @param {number} K
 * @return {string}
 */
var licenseKeyFormatting = function(S, K) {
    S = S.toUpperCase()
    
    let res = '',
        count = 0
    
    for (let i = S.length - 1; i >= 0; i--) {
        if (S[i] !== '-') {
            if (count === K) {
                res = S[i] + '-' + res
                count = 1
            } else if (count < K) {
                res = S[i] + res
                count++
            }
        }
    }
    
    return res
};