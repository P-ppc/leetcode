/**
 * @param {number[][]} M
 * @return {number[][]}
 */
var imageSmoother = function(M) {
    let res = []
    
    for (let i = 0; i < M.length; i++) {
        let row = []
        for (let j = 0; j < M[0].length; j++) {
            let points = [M[i][j]]
            
            if (j >= 1) {
                points.push(M[i][j - 1])
            }
            if (j + 1 < M[0].length) {
                points.push(M[i][j + 1])
            }
            if (i >= 1) {
                points.push(M[i - 1][j])
                if (j >= 1) {
                    points.push(M[i - 1][j - 1])
                }
                if (j + 1 < M[0].length) {
                    points.push(M[i - 1][j + 1])
                }
            }
            if (i + 1 < M.length) {
                points.push(M[i + 1][j])
                if (j >= 1) {
                    points.push(M[i + 1][j - 1])
                }
                if (j + 1 < M[0].length) {
                    points.push(M[i + 1][j + 1])
                }
            }
            row.push(parseInt(points.reduce((x, y) => x + y) / points.length))
        }
        res.push(row)
    }
    
    return res
};