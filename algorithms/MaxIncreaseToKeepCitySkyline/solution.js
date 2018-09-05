/**
 * @param {number[][]} grid
 * @return {number}
 */
var maxIncreaseKeepingSkyline = function(grid) {
    let length = grid.length,
        topSkyline = [],
        leftSkyline = [],
        count = 0
    
    for (let i = 0; i < length; i++) {
        leftSkyline.push(Math.max(...grid[i]))
        
        let skyline = 0
        for (let j = 0; j < length; j++)
            skyline = Math.max(skyline, grid[j][i])
        topSkyline.push(skyline)        
    }
    
    for (let i = 0; i < length; i++) {
        for (let j = 0; j < length; j++)
            count += Math.min(leftSkyline[i], topSkyline[j]) - grid[i][j]
    }
    
    return count
};