/**
 * @param {number} n
 * @return {number}
 */
var arrangeCoins = function(n) {
    let low = 0,
        high = n
    
    while (low <= high) {
        let mid = parseInt((low + high) / 2),
            sum = parseInt((mid + 1) * mid / 2)
        
        if (sum < n) {
            low = mid + 1
        } else if (sum > n) {
            high = mid - 1
        } else {
            return mid
        }
    }
    
    return high;
};