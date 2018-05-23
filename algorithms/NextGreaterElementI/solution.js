/**
 * @param {number[]} findNums
 * @param {number[]} nums
 * @return {number[]}
 */
var nextGreaterElement = function(findNums, nums) {
    let valueMap = {},
        stack = []
    
    nums.forEach(num => {
        while (stack.length > 0 && stack[stack.length - 1] < num) {
            let value = stack.pop()
            valueMap[value] = num
        }
        stack.push(num)
    })
    
    stack.forEach(num => {
        valueMap[num] = -1
    })
    
    return findNums.map(num => valueMap[num])
};