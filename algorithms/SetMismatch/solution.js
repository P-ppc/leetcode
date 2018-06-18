/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findErrorNums = function(nums) {
    let res = [],
        valueMap = new Map()
    
    nums.forEach(num => {
        if (valueMap.get(num) === undefined) {
            valueMap.set(num, true)
        } else {
            res.push(num)
        }
    })
    
    for (let i = 1; i <= nums.length; i++) {
        if (valueMap.get(i) === undefined) {
            res.push(i)
        }
    }
    
    return res
};