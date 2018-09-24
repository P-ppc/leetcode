/**
 * @param {character[][]} grid
 * @return {number}
 */
var numIslands = function(grid) {
    let stack = [],
        count = 0
    
    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[0].length; j++) {
            if (grid[i][j] == '1') {
                count++
                stack.push([i, j])
            }
            
            while (stack.length > 0) {
                let [x, y] = stack.pop()
                grid[x][y] = '-1'
                
                if (x > 0 && grid[x - 1][y] == '1')
                    stack.push([x - 1, y])
                if (x < grid.length - 1 && grid[x + 1][y] == '1')
                    stack.push([x + 1, y])
                if (y > 0 && grid[x][y - 1] == '1')
                    stack.push([x, y - 1])
                if (y < grid[0].length - 1 && grid[x][y + 1] == '1')
                    stack.push([x, y + 1])
            }
        }
    }
    
    return count
};