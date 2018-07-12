/**
 * @param {number[][]} grid
 * @return {number}
 */
var numMagicSquaresInside = function(grid) {
    let res = 0,
        rowLength = grid.length,
        colLength = grid[0].length,
        matrixBases = []
    
    for (let i = 0; i < rowLength; i++) {
        for (let j = 0; j < colLength; j++) {
            if (i + 2 < rowLength && j + 2 < colLength) matrixBases.push([i, j])
        }
    }
    
    matrixBases.forEach(base => {
        if (isMagicSquare(base, grid)) res++
    })
    
    return res
};

var isMagicSquare = function(base, grid) {
    let array = [0, 0, 0, 0, 0, 0, 0, 0, 0]
    
    for (let i = base[0]; i <= base[0] + 2; i++) {
        for (let j = base[1]; j <= base[1] + 2; j++) {
            if (grid[i][j] < 1 || grid[i][j] > 9) {
                return false
            } else if (array[grid[i][j] - 1] === 1) {
                return false
            }
            array[grid[i][j]] = 1
        }
    }
    
    if (grid[base[0]][base[1]] + grid[base[0]][base[1] + 1] + grid[base[0]][base[1] + 2] !== 15) return false
    else if (grid[base[0] + 1][base[1]] + grid[base[0] + 1][base[1] + 1] + grid[base[0] + 1][base[1] + 2] !== 15) return false
    else if (grid[base[0] + 2][base[1]] + grid[base[0] + 2][base[1] + 1] + grid[base[0] + 2][base[1] + 2] !== 15) return false
    else if (grid[base[0]][base[1]] + grid[base[0] + 1][base[1]] + grid[base[0] + 2][base[1]] !== 15) return false
    else if (grid[base[0]][base[1] + 1] + grid[base[0] + 1][base[1] + 1] + grid[base[0] + 2][base[1] + 1] !== 15) return false
    else if (grid[base[0]][base[1] + 2] + grid[base[0] + 1][base[1] + 2] + grid[base[0] + 2][base[1] + 2] !== 15) return false
    else if (grid[base[0]][base[1]] + grid[base[0] + 1][base[1] + 1] + grid[base[0] + 2][base[1] + 2] !== 15) return false
    else if (grid[base[0]][base[1] + 2] + grid[base[0] + 1][base[1] + 1] + grid[base[0] + 2][base[1]] !== 15) return false

    return true
}