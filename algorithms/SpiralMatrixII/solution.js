/**
 * @param {number} n
 * @return {number[][]}
 */
var generateMatrix = function(n) {
    let matrix = []
    
    for (let i = 0; i < n; i++) {
        matrix.push(new Array(n));
    }
    
    let i = j = 0,
        topLimit = leftLimit = 0,
        bottomLimit = rightLimit = n - 1,
        xDirection = 1,
        yDirection = 0
    
    for (let v = 1; v <= Math.pow(n, 2); v++) {
        matrix[i][j] = v
        
        if (j + xDirection > rightLimit) {
            topLimit = i + 1
            xDirection = 0
            yDirection = 1
        } else if (i + yDirection > bottomLimit) {
            rightLimit = j - 1
            xDirection = -1
            yDirection = 0
        } else if (j + xDirection < leftLimit) {
            bottomLimit = i - 1
            xDirection = 0
            yDirection = -1
        } else if (i + yDirection < topLimit) {
            leftLimit = j + 1
            xDirection = 1
            yDirection = 0
        }
        
        i += yDirection
        j += xDirection
    }
    return matrix
};