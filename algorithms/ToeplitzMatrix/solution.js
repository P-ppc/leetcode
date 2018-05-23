/**
 * @param {number[][]} matrix
 * @return {boolean}
 */
var isToeplitzMatrix = function(matrix) {
    for (let i = 0; i < matrix.length; i++) {
        let colLength = matrix[0].length
        for (let j = 0; j < colLength; j++) {
            if (0 <= i - 1 && 0 <= j - 1 && j - 1 <= colLength && matrix[i][j] !== matrix[i - 1][j - 1]) {
                return false
            }
        }
    }
    return true
};