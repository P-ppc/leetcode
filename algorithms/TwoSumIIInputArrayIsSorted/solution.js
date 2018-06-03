/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    let res = [],
        start = 0,
        end = numbers.length - 1
    
    while (start < end) {
        let value = numbers[start] + numbers[end]
        
        if (value === target) {
            res = [start + 1, end + 1]
            break
        } else if (value > target) {
            end--
        } else {
            start++
        }
    }
    
    return res
};