/**
 * @param {string} s
 * @return {string[][]}
 */
var partition = function(s) {
    let res = []
    backTrack(0, s, [], res)
    return res
};

var backTrack = function(beg, s, temp, res) {
    if (beg === s.length) {
        res.push(temp)
    } else {
        for (let i = beg; i < s.length; i++) {
            let part = s.substring(beg, i + 1)
            if (part === part.split('').reverse().join('')) {
                let t = temp.slice()
                t.push(part)
                backTrack(i + 1, s, t, res)
            }
        }
    }
};
