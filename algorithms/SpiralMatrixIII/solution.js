/**
 * @param {number} R
 * @param {number} C
 * @param {number} r0
 * @param {number} c0
 * @return {number[][]}
 */
var spiralMatrixIII = function(R, C, r0, c0) {
    let res = [],
        directions = [[0, 1], [1, 0], [0, -1], [-1, 0]],
        directionIndex = 0,
        maxStep = 1,
        curStep = 0
    
    while (res.length < R * C) {
        if (0 <= r0 && r0 < R && 0 <= c0 && c0 < C)
            res.push([r0, c0])
        
        if (curStep == maxStep)
            directionIndex = (directionIndex + 1) % 4
        else if (curStep == maxStep * 2) {
            directionIndex = (directionIndex + 1) % 4
            maxStep++
            curStep = 0
        }
        
        r0 += directions[directionIndex][0]
        c0 += directions[directionIndex][1]
        curStep++
    }
    
    return res
};