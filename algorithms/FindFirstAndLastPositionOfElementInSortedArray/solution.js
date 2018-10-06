/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function(nums, target) {
    let length = nums.length
    if (length == 0)
        return [-1, -1]
    
    let low = 0,
        high = length - 1
    
    while (low < high) {
        let mid = parseInt((low + high) / 2)
        
        if (nums[mid] < target)
            low = mid + 1
        else if (nums[mid] > target)
            high = mid - 1
        else
            high = mid
    }
    
    if (nums[low] != target)
        return [-1, -1]
    
    let temp = low
    low = 0
    high = length - 1
    
    while (low < high) {
        let mid = Math.ceil((low + high) / 2)
        
        if (nums[mid] < target)
            low = mid + 1
        else if (nums[mid] > target)
            high = mid - 1
        else
            low = mid
    }
    
    return [temp, low]
};