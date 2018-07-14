/**
 * @param {number[]} nums
 * @return {boolean}
 */
var checkPossibility = function(nums) {
    let parts = [],
        part = []
    
    nums.forEach((num, i) => {
        part.push(num)
        if (i + 1 < nums.length && nums[i + 1] < nums[i]) {
            parts.push(part)
            part = []
        }
    })
    
    if (part.length > 0) {
        parts.push(part)
    }
    
    if (parts.length <= 1) {
        return true
    } else if (parts.length === 2) {
        let left = parts[0],
            right = parts[1]
        
        if (left.length === 1 || right.length === 1) {
            return true
        } else if (right[1] >= left[left.length - 1] || right[0] >= left[left.length - 2]) {
            return true
        } else {
            return false
        }
    } else {
        return false
    }
};