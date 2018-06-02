/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    let count = 0,
        pre = 0,
        prePre = 0,
        i = 1
    
    while (i <= n) {
        if (i === 1) {
            count = 1
        } else if (i === 2) {
            count = 2
            pre = 1
        } else {
            prePre = pre
            pre = count
            count = pre + prePre
        }
        i++
    }
    
    return count
};