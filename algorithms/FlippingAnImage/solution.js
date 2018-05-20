/**
 * @param {number[][]} A
 * @return {number[][]}
 */
var flipAndInvertImage = function(A) {
    A.forEach(row => {
        let length = row.length
        for (let i = 0; i < length; i++) {
            row[i] ^= 1
        }
        let start = 0,
            end = length - 1
        while (start < end) {
            row[start] = row[start] + row[end]
            row[end] = row[start] - row[end]
            row[start] = row[start] - row[end]
            start++
            end--
        }
    })
    return A
};