/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsetsWithDup = function(nums) {
    let res = []
    nums.sort()
    backTrack(0, nums, [], res)
    return res
};

var backTrack = function(beg, nums, temp, res) {
    if (beg <= nums.length) {
        res.push(temp)
        let i = beg
        while (i < nums.length) {
            let num = nums[i],
                t = temp.slice()
            t.push(num)
            backTrack(i + 1, nums, t, res)
            
            while (i + 1 < nums.length && nums[i + 1] == num) {
                i++
            }
            i++
        }
    }
}