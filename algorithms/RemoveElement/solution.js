/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let start = 0,
        end = nums.length - 1
    while (start < nums.length) {
        if (nums[start] === val) {
            while (nums[end] === val && end > start) {
                end -= 1
            }
            if (end === start) {
                break
            } else {
                nums[start] = nums[start] + nums[end]
                nums[end] = nums[start] - nums[end]
                nums[start] = nums[start] - nums[end]
            }
        } else {
            start += 1
        }
    }
    return start
};