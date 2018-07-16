/**
 * @param {number[]} nums
 * @return {number[]}
 */
var singleNumber = function(nums) {
    let temp = res0 = res1 = 0
    
    nums.forEach(num => temp ^= num)
    
    let v = temp & ~ (temp - 1)
    
    nums.forEach(num => {
        if ((v & num) === v) {
            res0 ^= num
        } else {
            res1 ^= num
        }
    })
    
    return [res0, res1]
};