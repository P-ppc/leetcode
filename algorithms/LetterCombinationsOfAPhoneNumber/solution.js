/**
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function(digits) {
    let res = []
    if (digits !== '') backTrack(0, digits, '', res)
    return res
};

let digitsMap = [
    'abc',
    'def',
    'ghi',
    'jkl',
    'mno',
    'pqrs',
    'tuv',
    'wxyz'
]

var backTrack = function(beg, digits, temp, res) {
    if (beg === digits.length) {
        res.push(temp)
    } else {
        let chars = digitsMap[parseInt(digits[beg]) - 2]
        for (let i = 0; i < chars.length; i++) {
            let char = chars[i],
                t = temp + char
            backTrack(beg + 1, digits, t, res)
        }
    }
};
