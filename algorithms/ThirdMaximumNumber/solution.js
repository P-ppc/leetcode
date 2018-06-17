/**
 * @param {number[]} nums
 * @return {number}
 */
var thirdMax = function(nums) {
    let maxNum = null,
        secondNum = null,
        thirdNum = null
    
    nums.forEach(num => {
        if (maxNum === null) {
            maxNum = num
        } else {
            maxNum = Math.max(maxNum, num)
        }
    })
    
    nums.forEach(num => {
        if (num === maxNum) {
        } else if (secondNum === null) {
            secondNum = num
        } else {
            secondNum = Math.max(secondNum, num)
        }
    })
    
    nums.forEach(num => {
        if (num === maxNum || num === secondNum) {
        } else if (thirdNum === null) {
            thirdNum = num
        } else {
            thirdNum = Math.max(thirdNum, num)
        }
    })
    
    
    return thirdNum !== null ? thirdNum : maxNum
};