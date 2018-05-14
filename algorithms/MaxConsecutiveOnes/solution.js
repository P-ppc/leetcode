/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let res = [ 0 ]
    nums.forEach(num => {
        if (num === 1) {
            res[res.length - 1] += 1
        } else {
            res.push(0)
        }
    })
    return Math.max(...res)
};