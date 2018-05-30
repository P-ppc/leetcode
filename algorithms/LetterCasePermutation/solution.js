/**
 * @param {string} S
 * @return {string[]}
 */
var letterCasePermutation = function(S) {
    let res = new Set()
    
    S.split('').forEach(c => {
        if (res.size === 0) {
            res.add(c.toUpperCase())
            res.add(c.toLowerCase())
        } else {
            temp = new Set()
            res.forEach(v => {
                temp.add(v + c.toUpperCase())
                temp.add(v + c.toLowerCase())
            })
            res = temp
        }
    })
    
    res.add(S)
    return Array.from(res)
};