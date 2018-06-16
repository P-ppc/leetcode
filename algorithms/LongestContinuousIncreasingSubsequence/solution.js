/**
 * @param {number[]} nums
 * @return {number}
 */
var findLengthOfLCIS = function(nums) {
    let maxLength = 0,
        curSequence = []
    
    nums.forEach(num => {
        if (curSequence.length === 0) {
            curSequence.push(num)
        } else if (num > curSequence[curSequence.length - 1]) {
            curSequence.push(num)
        } else {
            curSequence = [num]
        }
        maxLength = Math.max(maxLength, curSequence.length)
    })
    
    return maxLength
};