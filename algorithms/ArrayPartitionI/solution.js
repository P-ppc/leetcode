/**
 * @param {number[]} nums
 * @return {number}
 */
var arrayPairSum = function(nums) {
    return nums.sort((x, y) => y - x).filter((d, i) => i % 2 === 0).reduce((x, y) => x + y, 0)
};