/**
 * @param {number[]} nums
 * @return {string[]}
 */
var findRelativeRanks = function(nums) {
    let maxScore = 0,
        res = new Array(nums.length)
    
    nums.forEach(num => maxScore = Math.max(maxScore, num))
    
    let scoreMap = new Array(maxScore + 1)
    
    nums.forEach((num, index) => scoreMap[num] = index)
    
    let count = 1
    scoreMap.reverse().forEach(i => {
        if (i !== undefined) {
            if (count === 1) {
                res[i] = 'Gold Medal'
            } else if (count === 2) {
                res[i] = 'Silver Medal'
            } else if (count === 3) {
                res[i] = 'Bronze Medal'
            } else {
                res[i] = String(count)
            }
            count++
        }
    })
    return res
};