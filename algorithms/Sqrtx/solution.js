/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function(x) {
    let cur = x,
        prev
    
    do {
        prev = cur
        cur = (cur + x / cur) / 2
    } while (Math.abs(cur - prev) > 0.00001)
    
    return parseInt(prev)
};