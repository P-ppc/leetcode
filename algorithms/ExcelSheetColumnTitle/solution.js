/**
 * @param {number} n
 * @return {string}
 */
var convertToTitle = function(n) {
    let res = ''
    
    while (n > 0) {
        let mod = n % 26
        n = parseInt(n / 26)
        
        if (mod === 0) {
            mod = 26
            n--
        }
        
        res = String.fromCharCode(mod + 64) + res
    }
    
    return res
};