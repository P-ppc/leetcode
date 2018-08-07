/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permuteUnique = function(nums) {
    let res = []
    nums.sort()
    backTrack(nums, [], res)
    return res
};

var backTrack = function(nums, temp, res) {
    if (nums.length === 0) {
        res.push(temp)
    } else {
        let i = 0
        while (i < nums.length) {
            let num = nums[i],
                tempNums = nums.slice(),
                t = temp.slice()
            
            tempNums.splice(i, 1)
            t.push(num)
            backTrack(tempNums, t, res)
            
            while (i + 1 < nums.length && nums[i + 1] === num) {
                i++
            }
            i++
        }
    }
}