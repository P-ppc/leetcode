/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {
    let res = []
    
    nums.forEach(num => {
        num = Math.abs(num)
        if (nums[num - 1] < 0) {
            res.push(num)
        } else {
            nums[num - 1] *= -1
        }
    })
    
    return res
};