/**
 * @param {number[][]} grid
 * @return {number}
 */
var maxAreaOfIsland = function(grid) {
    let maxArea = 0,
        dfsMap = {}
    
    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[0].length; j++) {
            if (grid[i][j] === 1 && dfsMap[`${i}X${j}`] === undefined) {
                let stack = [{ x: j, y: i }],
                    area = 0
                
                while (stack.length > 0) {
                    let point = stack.pop(),
                        x = point['x'],
                        y = point['y']
                    
                    if (dfsMap[`${y}X${x}`] === undefined) {
                        area++
                        dfsMap[`${y}X${x}`] = 1
                        
                        if (y >= 1 && grid[y - 1][x] === 1) stack.push({ x, y: y - 1 })
                        if (y + 1 < grid.length && grid[y + 1][x] === 1) stack.push({ x, y: y + 1})
                        if (x >= 1 && grid[y][x - 1] === 1) stack.push({ x: x - 1, y })
                        if (x + 1 < grid[0].length && grid[y][x + 1] === 1) stack.push({ x: x + 1, y })
                    }
                }
                
                maxArea = Math.max(maxArea, area)
            }
        }
    }
    return maxArea
};