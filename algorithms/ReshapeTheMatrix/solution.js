/**
 * @param {number[][]} nums
 * @param {number} r
 * @param {number} c
 * @return {number[][]}
 */
var matrixReshape = function(nums, r, c) {
    if (nums.length === 0 || nums[0].length === 0 || nums.length * nums[0].length !== r * c) {
        return nums
    }
    
    let reshapedMatrix = [],
        line = []
    
    nums.forEach(row => {
        row.forEach(value => {
            if (line.length + 1 === c) {
                line.push(value)
                reshapedMatrix.push(line)
                line = []
            } else {
                line.push(value)
            }
        })
    })
    return reshapedMatrix
};