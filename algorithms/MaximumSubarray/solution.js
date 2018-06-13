/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let maxSum = Number.MIN_SAFE_INTEGER,
        curSum = Number.MIN_SAFE_INTEGER
    
    nums.forEach(num => {
        if (curSum >= 0 && curSum + num >= 0) {
            curSum += num
        } else {
            curSum = num
        }
        
        maxSum = Math.max(maxSum, curSum)
    })
    
    return maxSum
};