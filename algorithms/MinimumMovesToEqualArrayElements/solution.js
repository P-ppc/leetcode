/**
 * @param {number[]} nums
 * @return {number}
 */
var minMoves = function(nums) {
    return nums.reduce((x, y) => x + y) - Math.min(...nums) * nums.length
};