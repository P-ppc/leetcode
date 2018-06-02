/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    let res = []
    for (let i = 0; i <= nums.length; i++) {
        res.push(i)
    }
    
    nums.forEach(num => res[num] = 0)
    
    let effectiveLength = 0,
        pos = 0
    
    for (let i = 0; i < res.length; i++) {
        if (res[i] !== 0) {
            res[pos] = res[i]
            pos++
            effectiveLength++
        }
    }
    res.length = effectiveLength
    return res
};