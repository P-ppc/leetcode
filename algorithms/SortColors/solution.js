/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    let start = 0,
        end = nums.length - 1,
        cur = 0
    
    while (cur <= end) {
        if (nums[cur] == 0 && cur != start) {
            nums[start] = nums[start] + nums[cur]
            nums[cur] = nums[start] - nums[cur]
            nums[start++] -= nums[cur]
        } else if (nums[cur] == 2 && cur != end) {
            nums[end] = nums[end] + nums[cur]
            nums[cur] = nums[end] - nums[cur]
            nums[end--] -= nums[cur]
        } else
            cur++
    }
};