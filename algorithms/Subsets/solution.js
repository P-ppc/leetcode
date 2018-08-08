/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsets = function(nums) {
    let res = []
    backTrack(0, nums, [], res)
    return res
};

var backTrack = function(beg, nums, temp, res) {
    if (beg <= nums.length) {
        res.push(temp)
        for (let i = beg; i < nums.length; i++) {
            let t = temp.slice()
            t.push(nums[i])
            backTrack(i + 1, nums, t, res)
        }
    }
}