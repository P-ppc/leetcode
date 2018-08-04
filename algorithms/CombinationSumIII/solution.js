/**
 * @param {number} k
 * @param {number} n
 * @return {number[][]}
 */
var combinationSum3 = function(k, n) {
    let res = []
    backTrack(0, [1, 2, 3, 4, 5, 6, 7, 8, 9], [], k, n, res)
    return res
};

var backTrack = function (beg, candidates, temp, k, target, res) {
    if (temp.length === k && target === 0) {
        res.push(temp)
    } else if (temp.length < k) {
        for (let i = beg; i < candidates.length; i++) {
            let c = candidates[i]
            if (c <= target) {
                let t = temp.slice(0)
                t.push(c)
                backTrack(i + 1, candidates, t, k, target - c, res)
            }
        }
    }
};
