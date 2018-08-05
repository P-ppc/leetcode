/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permute = function(nums) {
    let res = []
    backTrack(nums, [], res)
    return res
};

var backTrack = function(nums, temp, res) {
    if (nums.length === 0) {
        res.push(temp)
    } else {
        for (let i = 0; i < nums.length; i++) {
            let num = nums[i],
                tempNums = nums.slice(0),
                t = temp.slice(0)
            
            tempNums.splice(i, 1)
            t.push(num)
            backTrack(tempNums, t, res)
        }
    }
};
