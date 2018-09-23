/**
 * @param {number[]} nums
 * @return {number}
 */
var findPeakElement = function(nums) {
    let length = nums.length,
        low = 0,
        high = length - 1
    
    while (low <= high) {
        let mid = parseInt((low + high) / 2),
            leftVal = mid > 0 ? nums[mid - 1] : nums[mid] - 1,
            rightVal = mid < length - 1 ? nums[mid + 1] : nums[mid] - 1
        
        if (nums[mid] < leftVal)
            high = mid - 1
        else if (nums[mid] < rightVal)
            low = mid + 1
        else
            return mid
    }
};