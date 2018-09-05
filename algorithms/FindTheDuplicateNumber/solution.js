/**
 * @param {number[]} nums
 * @return {number}
 */
var findDuplicate = function(nums) {
    let low = 1,
        high = nums.length - 1
    
    while (low < high) {
        let mid = parseInt((low + high) / 2),
            count = 0
        
        nums.forEach(n => count += (n <= mid ? 1 : 0))
        
        if (count > mid) {
            high = mid
        } else {
            low = mid + 1
        }
    }
    
    return low
};