/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum2 = function(candidates, target) {
     let res = []
    backTrack(candidates, [], target, res)
    return res.map(s => s.split(',').map(d => parseInt(d)))
};

var backTrack = function(candidates, temp, target, res) {
     if (target === 0) {
        temp.sort()
        let s = temp.join(',')
        if (res.findIndex(d => d === s) === -1) {
            res.push(s)
        }
    } else {
        candidates.forEach((c, i) => {
            if (c <= target) {
                let t = temp.slice(0),
                    temp_candidates = candidates.slice(0)
                t.push(c)
                temp_candidates.splice(i, 1)
                backTrack(temp_candidates, t, target - c, res)
            }
        })
    }
};