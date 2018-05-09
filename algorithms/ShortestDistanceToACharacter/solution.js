/**
 * @param {string} S
 * @param {character} C
 * @return {number[]}
 */
var shortestToChar = function(S, C) {
    let res = [],
        pos = []
    
    for (let i = 0; i < S.length; i++) {
        if (S[i] === C) {
            pos.push(i)
        }
    }
    
    for (let i = 0; i < S.length; i++) {
        res.push(Math.min(...pos.map(p => Math.abs(i - p))))
    }
    return res
};