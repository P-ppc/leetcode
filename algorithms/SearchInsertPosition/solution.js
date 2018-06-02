/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function(nums, target) {
    let start = 0,
        end = nums.length
    
    while (start < end) {
        let index = parseInt((start + end) / 2),
            mid = nums[index]
        
        if (mid < target) {
            start = index + 1
        } else if (mid > target) {
            end = index - 1
        } else {
            return index
        }
    }
    
    if (nums[start] < target) {
        return start + 1
    } else {
        return start
    }
};