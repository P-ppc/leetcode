/**
 * @param {number[]} nums
 * @return {number}
 */
var findShortestSubArray = function(nums) {
    let numsMap = {},
        mostNums = [],
        maxCount = 0
    
    for (let i = 0; i < nums.length; i++) {
        let num = nums[i]
        
        if (numsMap[num] === undefined) {
            numsMap[num] = {
                start: i,
                end: i,
                count: 1
            }
        } else {
            numsMap[num].end = i
            numsMap[num].count += 1
        }
        
        if (numsMap[num].count > maxCount) {
            maxCount = numsMap[num].count
            mostNums = [num]
        } else if (numsMap[num].count === maxCount) {
            mostNums.push(num)
        }
    }
    
    return Math.min(...mostNums.map(num => numsMap[num].end - numsMap[num].start + 1))
};