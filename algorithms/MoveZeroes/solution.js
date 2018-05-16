/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    let length = nums.length
    for (let i = 0; i < length; i++) {
        if (nums[i] !== 0) continue
        for (let j = i; j < length; j++) {
            if (nums[j] !== 0) {
                nums[i] = nums[i] + nums[j]
                nums[j] = nums[i] - nums[j]
                nums[i] = nums[i] - nums[j]
                break   
            }
        }
    }
};