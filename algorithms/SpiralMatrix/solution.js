/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
    let m = matrix.length
    if (m == 0) return []
    
    let n = matrix[0].length,
        res = [],
        i = j = 0,
        topLimit = leftLimit = 0,
        bottomLimit = m - 1,
        rightLimit = n - 1,
        xDirection = 1,
        yDirection = 0
    
    for (let c = 0; c < m * n; c++) {
        res.push(matrix[i][j])
        
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
    
    
    return res
};