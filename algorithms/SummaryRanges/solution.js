/**
 * @param {number[]} nums
 * @return {string[]}
 */
var summaryRanges = function(nums) {
    let length = nums.length,
        i = 0,
        j = 0,
        res = []
    
    if (length == 0)
        return res
    
    while (j < length) {
        if (j > 0 && nums[j - 1] + 1 < nums[j]) {
            res.push(j - 1 > i ? `${nums[i]}->${nums[j - 1]}` : `${nums[i]}`)
            i = j
        }
        j++
    }
    res.push(j - 1 > i ? `${nums[i]}->${nums[j - 1]}` : `${nums[i]}`)
    
    return res
};