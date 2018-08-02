/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum = function(candidates, target) {
    let res = [],
        t = []
    backTrack(candidates, [], target, res)
    res.forEach(s => {
        t.push(s.split(',').map(d => parseInt(d)))
    })
    return t
};

var backTrack = function(candidates, ans, target, res) {
    if (target === 0) {
        ans.sort()
        let s = ans.join(',')
        if (res.findIndex(d => d === s) === -1) {
            res.push(s)
        }
    } else {
        candidates.forEach(c => {
            if (c <= target) {
                let temp = ans.slice(0)
                temp.push(c)
                backTrack(candidates, temp, target - c, res)
            }
        })
    }
};