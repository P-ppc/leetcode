/**
 * @param {number[][]} A
 * @return {number[][]}
 */
var transpose = function(A) {
    let res = []
    
    for (let j = 0; j < A[0].length; j++) {
        let row = []
        for (let i = 0; i < A.length; i++) {
            row.push(A[i][j])
        }
        res.push(row)
    }
    
    return res
};