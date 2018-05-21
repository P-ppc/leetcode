/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    let res = []
    for (let i = 0; i < numRows; i++) {
        if (i == 0) {
            res.push([1])
        } else {
            temp = [1]
            last = res[res.length - 1]
            for (let j = 0; j < last.length; j++) {
                if (j + 1 < last.length) {
                    temp.push(last[j] + last[j + 1])
                } else {
                    temp.push(last[j])
                }
            }
            res.push(temp)
        }
    }    
    return res
};