/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNonDuplicate = function(nums) {
    let left = 0,
        right = nums.length - 1
    
    while (left < right) {
        let mid = parseInt((left + right) / 2)
        
        if (nums[mid] === nums[mid + 1]) {
            if (mid % 2 === 0) left = mid + 1
            else right = mid - 1
        } else if (nums[mid] === nums[mid - 1]) {
            if (mid % 2 === 0) right = mid - 1
            else left = mid + 1
        } else {
            return nums[mid]
        }
    }
    
    return nums[left]
};