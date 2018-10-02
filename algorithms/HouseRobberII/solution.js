/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function(nums) {
    let length = nums.length
    if (length == 1)
        return nums[0]
    
    let dp1 = new Array(length),
        dp2 = new Array(length)
    
    for (let i = 0; i < length - 1; i++) {
        dp1[i] = Math.max(nums[i] + (i > 1 ? dp1[i - 2] : 0), i > 0 ? dp1[i - 1] : 0)
        dp2[i] = Math.max(nums[i + 1] + (i > 1 ? dp2[i - 2] : 0), i > 0 ? dp2[i - 1] : 0)
    }
    
    return length > 1 ? Math.max(dp1[length - 2], dp2[length - 2]) : 0
};