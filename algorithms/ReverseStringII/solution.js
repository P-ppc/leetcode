/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var reverseStr = function(s, k) {
    let res = s.split(''),
        i = 0
    
    while (i < s.length) {
        if (i % (2 * k) === 0) {
            let start = i,
                end = i + k - 1
            if (end >= s.length) {
                end = s.length - 1
            }
            while (start < end) {
                let temp = res[start]
                res[start++] = res[end]
                res[end--] = temp
            }
            i = end + 1
        } else {
            i++
        }
    }
    
    return res.join('')
};