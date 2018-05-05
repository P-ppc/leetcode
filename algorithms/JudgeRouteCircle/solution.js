/**
 * @param {string} moves
 * @return {boolean}
 */
var judgeCircle = function(moves) {
    let x = 0,
        y = 0
    
    moves.split('').forEach(move => {
        if (move === 'R') x++
        else if (move === 'L') x--
        else if (move === 'U') y++
        else if (move === 'D') y--
    })
    return x === 0 && y === 0
};