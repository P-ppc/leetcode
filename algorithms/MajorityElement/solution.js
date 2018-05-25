/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let visitedMap = {}
    for (let i = 0; i < nums.length; i++) {
        let num = nums[i]
        if (visitedMap[num] === undefined) {
            visitedMap[num] = 1
        } else {
            visitedMap[num]++
        }
        if (visitedMap[num] > parseInt(nums.length / 2)) {
            return num
        }
    }
};