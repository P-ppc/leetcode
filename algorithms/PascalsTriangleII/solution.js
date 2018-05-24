/**
 * @param {number} rowIndex
 * @return {number[]}
 */
var getRow = function(rowIndex) {
    let res = [1],
        temp = []
    for (let i = 1; i < rowIndex + 1; i++) {
        for (let j = 0; j < i + 1; j++) {
            if (j === 0) temp.push(res[j])
            else if (j === res.length) temp.push(res[j - 1])
            else temp.push(res[j - 1] + res[j])
        }
        res = temp
        temp = []
    }
    return res
};