/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    let totalSum = 0,
        leftSum = 0
    
    nums.forEach(num => totalSum += num)
    
    for (let i = 0; i < nums.length; i++) {
        if (leftSum === totalSum - nums[i] - leftSum) {
            return i
        } else {
            leftSum += nums[i]
        }
    }
    
    return -1
};