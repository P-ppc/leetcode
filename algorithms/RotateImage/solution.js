/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
    let n = matrix.length,
        i = 0
    
    while (i < parseInt(n / 2)) {
        let x = i,
            y = i
        
        while (y < n - 1 - i) {
            matrix[x][y] += matrix[y][n - 1 -x]
            matrix[y][n - 1 -x] = matrix[x][y] - matrix[y][n - 1 -x]
            matrix[x][y] -= matrix[y][n - 1 -x]
            
            matrix[x][y] += matrix[n - 1 - x][n - 1 - y]
            matrix[n - 1 - x][n - 1 - y] = matrix[x][y] - matrix[n - 1 - x][n - 1 - y]
            matrix[x][y] -= matrix[n - 1 - x][n - 1 - y]
            
            matrix[x][y] += matrix[n - 1 - y][x]
            matrix[n - 1 - y][x] = matrix[x][y] - matrix[n - 1 - y][x]
            matrix[x][y] -= matrix[n - 1 - y][x]
            
            y++ 
        }
        i++
    }
};