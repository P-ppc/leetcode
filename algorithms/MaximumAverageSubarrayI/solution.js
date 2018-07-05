/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function(nums, k) {
    let maxSum = 0,
        curSum = 0,
        preIndex = -k
    
    nums.forEach(num => {
        if (preIndex < 0) {
            curSum += num
            maxSum = curSum
            preIndex++
        } else {
            curSum += num - nums[preIndex++]
            maxSum = Math.max(maxSum, curSum)
        }
    })
    
    return maxSum / k
};