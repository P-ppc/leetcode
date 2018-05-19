/**
 * @param {number[]} nums
 * @param {number} k
 * @return {boolean}
 */
var containsNearbyDuplicate = function(nums, k) {
    let intMap = {}
    for (let i = 0; i < nums.length; i++) {
        let num = nums[i]
        if (intMap[num] === undefined || i - intMap[num] > k) {
            intMap[num] = i
        } else {
            return true
        }
    }
    return false
};