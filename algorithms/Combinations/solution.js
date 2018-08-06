/**
 * @param {number} n
 * @param {number} k
 * @return {number[][]}
 */
var combine = function(n, k) {
    let res = []
    backTrack(0, Array.from({ length: n }, (v, k) => k + 1), k, [], res)
    return res
};

var backTrack = function(beg, nums, k, temp, res) {
    if (temp.length === k) {
        res.push(temp)
    } else {
        for (let i = beg; i < nums.length; i++) {
            let num = nums[i],
                t = temp.slice()
            t.push(num)
            backTrack(i + 1, nums, k, t, res)
        }
    }
}