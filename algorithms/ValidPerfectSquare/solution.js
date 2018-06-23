/**
 * @param {number} num
 * @return {boolean}
 */
var isPerfectSquare = function(num) {
    let low = 0,
        high = num
    
    while (low <= high) {
        let mid = parseInt((low + high) / 2),
            midPower = mid * mid
        
        if (midPower > num) {
            high = mid - 1
        } else if (midPower < num) {
            low = mid + 1
        } else {
            return true
        }
    }
    
    return false
};