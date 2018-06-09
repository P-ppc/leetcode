/**
 * @param {string} S
 * @return {number[][]}
 */
var largeGroupPositions = function(S) {
    let lastCharacter = null,
        start = 0,
        end = 0,
        res = []
    
    for (let i = 0; i < S.length; i++) {
        if (lastCharacter === null || lastCharacter === S[i]) {
            end = i
        } else {
            if (end - start + 1 >= 3) {
                res.push([start, end])
            }
            end = start = i
        }
        lastCharacter = S[i]
    }
    
    if (end - start + 1 >= 3) {
        res.push([start, end])
    }
    
    return res
};