/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    // This way use exrta time
    let length = nums.length
    
    for (let i = 0; i < k; i++) {
        let temp = nums[length - 1]
        for (let j = 0; j < length; j++) {
            let t = nums[j]
            nums[j] = temp
            temp = t
        }
    }
};