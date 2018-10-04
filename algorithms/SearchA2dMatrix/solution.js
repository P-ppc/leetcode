/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    let m = matrix.length,
        n = m == 0 ? 0 : matrix[0].length
    if (m == 0 || n == 0)
        return false
    
    let low = 0,
        high = m - 1,
        rowIndex = -1
    while (low <= high) {
        let mid = parseInt((low + high) / 2)
        if (matrix[mid][n - 1] < target)
            low = mid + 1
        else if (matrix[mid][0] > target)
            high = mid - 1
        else {
            rowIndex = mid
            break
        }
    }
    if (rowIndex == -1)
        return false
    
    low = 0
    high = n - 1
    while (low <= high) {
        let mid = parseInt((low + high) / 2)
        if (matrix[rowIndex][mid] < target)
            low = mid + 1
        else if (matrix[rowIndex][mid] > target)
            high = mid - 1
        else
            return true
    }
    
    return false
};