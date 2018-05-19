/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    let intMap = {}
    for (let i = 0; i < nums.length; i++) {
        let num = nums[i]
        if (intMap[num] === undefined) {
            intMap[num] = true
        } else {
            return true
        }
    }
    return false
};