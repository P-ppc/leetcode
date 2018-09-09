/**
 * @param {number} N
 * @return {number}
 */
var countArrangement = function(N) {
    let res = [],
        candidates = []
    
    for (let i = 1; i <= N; i++)
        candidates.push(i)
    
    backTrack(candidates, [], res)
    return res.length
};

var backTrack = function (candidates, temp, res) {
    if (candidates.length == 0) {
        res.push(temp)
    } else {
        let i = temp.length + 1
        candidates.forEach((c, index) => {
            if (c % i == 0 || i % c == 0) {
                let tempCandidates = candidates.slice(),
                    t = temp.slice()
                tempCandidates.splice(index, 1)
                t.push(c)
                backTrack(tempCandidates, t, res)
            }
        })
    }
};