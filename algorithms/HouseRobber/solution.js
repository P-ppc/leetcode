/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function(nums) {
    let maxCounts = []
    nums.forEach(num => {
        if (maxCounts.length === 0) {
            maxCounts.push(num)
        } else if (maxCounts.length === 1) {
            maxCounts.push(Math.max(num, maxCounts[0]))
        } else {
            let length = maxCounts.length
            maxCounts.push(Math.max(maxCounts[length - 2] + num, maxCounts[length - 1]))
        }
    })
    
    return maxCounts.length > 0 ? Math.max(...maxCounts) : 0
};