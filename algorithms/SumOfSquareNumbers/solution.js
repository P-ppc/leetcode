/**
 * @param {number} c
 * @return {boolean}
 */
var judgeSquareSum = function(c) {
    if (c < 0) return false
    
    let radical = parseInt(Math.sqrt(c)),
        beg = 0
    
    while (beg <= radical) {
        let temp = beg * beg + radical * radical
        if (temp === c) {
            return true
        } else if (temp > c) {
            radical--
        } else {
            beg++
        }
    }
    
    return false
};